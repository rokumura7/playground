const fs = require('fs');
const axios = require('axios');
const fetchPdfText = require('./PdfReader');

(async () => {
  const isURL = target => target.match(/(http).*/g)
  const getPdf = async url => await axios.get(
    url, 
    { 
      header: { 
        Accept: 'application/pdf'
      }, 
      responseType: 'arraybuffer' 
    }
  ).then(res => res.data)

  const arg = process.argv[2]
  const buf = isURL(arg) ? await getPdf(arg) : fs.readFileSync(arg)

  const pdftxt = await fetchPdfText(buf)
  const pdf = pdftxt.map(page => page.reduce((c, n) => c + '\n' + n))
  console.log(pdf)
})()
