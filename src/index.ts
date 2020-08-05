import puppeteer from 'puppeteer'
import { Page } from 'puppeteer'
import Article from './article'

const goto = async (page: Page, url: string): Promise<Page> => {
  await page.goto(url)
  await page.waitFor(1000)
  return page
}

const showArticlesWithOver100Likes = (articles: Article[]): void => {
  articles
    .filter(article => article.likeCount >= 100)
    .forEach(article => console.log(`[${article.likeCount}]  ${article.title}`))
}

const showArticlesSortByLikes = (articles: Article[]): void => {
  articles
    .sort((a1, a2) => a2.likeCount - a1.likeCount)
    .forEach(article => console.log(`[${article.likeCount}]  ${article.title}`))
}

(async () => {
  const browser = await puppeteer.launch()
  const page = await browser.newPage()
  const qiita = await goto(page, 'https://qiita.com/')
  console.log(await qiita.title())
  // TODO: (node:34230) UnhandledPromiseRejectionWarning: Error: Evaluation failed: ReferenceError: article_1 is not defined
  const articles = await qiita.$$eval('.tr-Item', tr => tr.map(elm =>
    new Article(
      elm.querySelector('.tr-Item_likeCount')!.textContent,
      elm.querySelector('.tr-Item_title')!.textContent
    )
  ))
  console.log('--- articles with over 100 likes. ---')
  showArticlesWithOver100Likes(articles)

  console.log('--- sort by likes. ---')
  showArticlesSortByLikes(articles)

  await browser.close()
})();