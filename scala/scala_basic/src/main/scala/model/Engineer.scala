package model

case class Name(value: String)

sealed trait Engineer {
  def develop(): Unit
}

sealed abstract class Person(name: Name) {
  def greet(): Unit = println(s"Hi, I'm ${name.value}.")
}

class BackendEngineer(name: Name) extends Person(name) with Engineer {
  override def develop(): Unit = println("バックエンドの開発")
}

class FrontendEngineer(name: Name) extends Person(name) with Engineer {
  override def develop(): Unit = println("フロントエンドの開発")
}
