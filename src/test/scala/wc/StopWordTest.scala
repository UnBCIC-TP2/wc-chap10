package wc

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class StopWordTest extends FlatSpec with Matchers with GivenWhenThen {
  behavior of "A stopword"

  it should "return true when we call isStopWord(\"that\")" in {
    StopWord.isStopWord("that") should be (true) 
  }

  it should "return false when we cll isStopWord(\"Crista\"" in {
    StopWord.isStopWord("Crista") should be (false) 
  }
}
