const puppeteer = require('puppeteer');

(async () => {
  const browser = await puppeteer.launch()
  const page = await browser.newPage()
  const qiita = await goto(page, 'https://qiita.com/')
  const articles = await qiita.$$('div.tr-Item')
  for (let i = 1; i <= articles.length; i++) {
    const like = await page.$eval(`div.tr-Item:nth-child(${i}) .tr-Item_likeCount`, elm => elm.textContent)
    if (like < 100) continue
    const title = await page.$eval(`div.tr-Item:nth-child(${i}) .tr-Item_title`, elm => elm.textContent)
    console.log(`[${like}]${title}`)
  }
  await browser.close()
})();

goto = async (page, url) => {
  await page.goto(url)
  await page.waitFor(1000)
  return page
}