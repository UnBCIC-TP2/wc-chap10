package wc

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter

import scala.io.Source


class StopWordTest extends FlatSpec with Matchers with GivenWhenThen {
  behavior of "A stopword"

  it should "return true when we call isStopWord(\"that\")" in {
    val sw = new StopWord(Source.fromResource("stop-words.txt"))
    sw.isStopWord("that") should be (true) 
  }

  it should "return false when we cll isStopWord(\"Crista\"" in {
    val sw = new StopWord(Source.fromResource("stop-words.txt"))
    sw.isStopWord("Crista") should be (false) 
  }
}
