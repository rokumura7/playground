object ControlStructure {
  def sample(): Unit = {
    // if
    val age = 30
    if (age >= 20) println("adult")
    else println("child")

    // while
    var i = 1
    while(i <= 5) {
      println(i)
      i += 1
    }

    // for
    for(x <- 1 to 5){
      println(x)
    }
  }
}
