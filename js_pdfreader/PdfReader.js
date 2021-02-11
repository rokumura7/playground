const PdfReader = require("pdfreader/PdfReader");

module.exports = async buffer => {
  return new Promise((resolve) => {
    const pdftxt = []
    let pg = 0
    new PdfReader().parseBuffer(buffer, (err, item) => {
      if (err) throw Error('Failed to read PDF file : ' + err)
      else if (!item) { // ファイル末尾
        pdftxt.forEach(v => v.forEach(_v => { _v.splice(1, 2)}))
        resolve(pdftxt)
      } else if (item && item.page) { // ページ先頭 配列の初期化
        pg = item.page - 1
        pdftxt[pg] = []
      } else if (item.text) { // ファイル途中
        let t = 0
        pdftxt[pg].forEach(v => {
          if (v[1] == item.y) {
            v[0] += item.text
            t = 1
          }
        })
        if (t == 0) {
          pdftxt[pg].push([item.text, item.y, item.x]);
        }
      }
    });
  });
}
