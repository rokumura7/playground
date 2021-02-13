package model

import _test.AbstractSpec

class EngineerSpec extends AbstractSpec {
  "Name" should "be compared by structure" in {
    val name1 = Name("test")
    val name2 = Name("test")
    name1 == name2 should be (true)
  }
}
