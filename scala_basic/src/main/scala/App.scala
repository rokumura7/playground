object App {
  def main(args: Array[String]): Unit = {
    // 基礎のき
    Basic.sample()

    // 制御構文
    ControlStructure.sample()

    // クラス周り
    ClassSample.sample()

    // オブジェクト
    println(Counter.getNum)
    Counter.add()
    println(Counter.getNum)
    Counter.add()
    Counter.add()
    println(Counter.getNum)
  }
}
