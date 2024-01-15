import puppeteer from 'puppeteer';

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto('https://rokumura7.github.io/');

  console.log(await page.title());

  await Promise.all([
    page.click('header > nav > div > a:nth-child(2)'),
    page.waitForNavigation(),
  ]);

  const items = await page.$$(
    '#__next > div > div > div.absolute.pt-20.inset-0.h-full.min-w-387 > div > div > div.flex.justify-center.mb-5 > ul > li:nth-child(1) > div > div > p'
  );
  for (const item of items) {
    const text = await page.evaluate((elm) => elm.innerText, item);
    console.log(text);
  }

  await browser.close();
})();
