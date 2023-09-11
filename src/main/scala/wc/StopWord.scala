package wc

import scala.io.Source

class StopWord(val path: Source) {
  val stopWords = path.getLines.toList

  println(stopWords.length)
  def isStopWord(word: String) = stopWords.contains(word.toLowerCase()) 
}
