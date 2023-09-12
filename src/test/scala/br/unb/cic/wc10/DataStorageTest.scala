package br.unb.cic.wc10

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen

import scala.io.Source

class DataStorageTest extends FlatSpec with Matchers with GivenWhenThen {
  behavior of "A DataStorage"

  it should "return when we call DataStorage(\"frankstein.txt\").size" in {
    val ds = new DataStorageManager(Source.fromResource("frankstein.txt"))
    ds.size should be (35245) 
  }

}
