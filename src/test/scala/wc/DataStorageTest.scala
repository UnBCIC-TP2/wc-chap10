package wc

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class DataStorageTest extends FlatSpec with Matchers with GivenWhenThen {
  behavior of "A DataStorage"

  it should "return when we call DataStorage(\"teste.txt\").size" in {
    val ds = new DataStorageManager("teste.txt")

    ds.size should be (7) 
  }

}
