import puppeteer from 'puppeteer';

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto('https://qiita.com/');

  console.log(await page.title());

  const articles = await page.$$('article > h2 > a');
  for (const article of articles) {
    const title = await page.evaluate((elm) => elm.innerText, article);
    console.log(title);
  }

  await browser.close();
})();
