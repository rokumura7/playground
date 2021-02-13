object Basic {
  def sample(): Unit = {
    // コメント
    /**
     * 複数行コメント
     */

    // 文字出力
    println("Hello World.")

    /**
     * 変数/定数
     * Scalaでは基本的に定数を使うことが好まれる
     */
    // 変数
    var x: Int = 1
    println(x)
    x = 2
    println(x)

    // 定数
    val y: Int = 10
    println(y)
    // y = 20 定数のため変更不可

    /**
     * 型推論
     * 値から型が推論されるため宣言時に省略が可能
     */
    val z = 5

    // 四則演算
    println(1 + 1)  // 2
    println(3 - 1)  // 2
    println(4 * 2)  // 8
    println(10 / 2) // 5
    println(10 % 3) // 1

    /**
     * ブロック
     * {}を用いて処理をまとめることができる
     * 最終行が結果として評価される
     */
    println({
      val x = 5
      val y = 2
      val z = 3

      val a = x + y
      a % z
    }) // 1
  }
}
