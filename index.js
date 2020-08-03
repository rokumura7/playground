const puppeteer = require('puppeteer');

(async () => {
  console.log('Hello')
  const browser = await puppeteer.launch()
  await browser.newPage()
    .then(page => page.goto('https://qiita.com/'))
    .then(page => console.log(page.status()))
  await browser.close()
})();