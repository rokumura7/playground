import puppeteer from 'puppeteer'
import { Page } from 'puppeteer'
import Article from './article'

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

const fetchInnerText = async (page: Page, selector: string): Promise<string> => {
  return page.$(selector).then(target => page.evaluate(elm => elm.innerText, target))
}

(async () => {
  const browser = await puppeteer.launch()
  const page = await browser.newPage()
  await page.goto('https://qiita.com/')
    .then(() => page.waitFor(1000))

  const tr = await page.$$('.tr-Item')

  const articles: Article[] = []
  for (let i = 1; i <= tr.length; i++) {
    const title = await fetchInnerText(page, `.tr-Item:nth-child(${i}) .tr-Item_title`)
    const likeCount = await fetchInnerText(page, `.tr-Item:nth-child(${i}) .tr-Item_likeCount`)
    articles.push(new Article(title, likeCount))
  }

  console.log('--- articles with over 100 likes. ---')
  showArticlesWithOver100Likes(articles)

  console.log('--- sort by likes. ---')
  showArticlesSortByLikes(articles)

  await browser.close()
})();