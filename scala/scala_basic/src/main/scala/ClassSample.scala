import model.{BackendEngineer, FrontendEngineer, Name}

object ClassSample {
  def sample(): Unit = {
    val members = Seq(
      new BackendEngineer(Name("rokumura")),
      new FrontendEngineer(Name("haxpig")),
      new BackendEngineer(Name("hogehoge")),
      new BackendEngineer(Name("fugafuga"))
    )

    members.foreach(m => {
      m.greet()
      m.develop()
    })
  }
}
