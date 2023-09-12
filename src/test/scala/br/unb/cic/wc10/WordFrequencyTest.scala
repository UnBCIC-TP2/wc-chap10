package br.unb.cic.wc10

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter

class WordFrequencyTest extends FlatSpec with Matchers with GivenWhenThen {
  behavior of "A word frequency"

  it should "return (haskell, 3) (java,2) (python, 1) when mapping many words" in {
    val wf = new WordFrequencyManager()

    wf.mapWord("cpp")
    wf.mapWord("haskell") 
    wf.mapWord("c")
    wf.mapWord("haskell") 
    wf.mapWord("php")
    wf.mapWord("haskell")
    wf.mapWord("python")
    wf.mapWord("java")
    wf.mapWord("python")
    wf.mapWord("java")

    val res = wf.frequentWords(3)

    res.size should be (3) 
  }

}
