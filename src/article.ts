export default class Article {
  title: string | null
  likeCount: number

  constructor(title: string | null, likeCount: string | null) {
    console.log(title)
    this.title = title
    this.likeCount = Number(likeCount)
  }
}
