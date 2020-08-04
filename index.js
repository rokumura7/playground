const puppeteer = require('puppeteer');

(async () => {
  const browser = await puppeteer.launch()
  const page = await browser.newPage()
  const qiita = await goto(page, 'https://qiita.com/')
  const articles = await qiita.$$eval('.tr-Item', tr => tr.map(elm => ({
      likeCount: elm.querySelector('.tr-Item_likeCount').textContent,
      title: elm.querySelector('.tr-Item_title').textContent
  })))
  console.log('--- articles with over 100 likes. ---')
  articles.filter(article => article.likeCount >= 100)
    .forEach(article => console.log(`[${article.likeCount}]  ${article.title}`))

  console.log('--- sort by likes. ---')
  articles.sort((a1, a2) => a2.likeCount - a1.likeCount)
    .forEach(article => console.log(`[${article.likeCount}]  ${article.title}`))

  await browser.close()
})();

goto = async (page, url) => {
  await page.goto(url)
  await page.waitFor(1000)
  return page
}