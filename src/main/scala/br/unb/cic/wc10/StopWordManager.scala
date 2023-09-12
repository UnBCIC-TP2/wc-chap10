package br.unb.cic.wc10

import scala.io.Source

class StopWordManager(val path: Source) {
  val stopWords = path.getLines.toList
  def isStopWord(word: String) = stopWords.contains(word.toLowerCase()) 
}
