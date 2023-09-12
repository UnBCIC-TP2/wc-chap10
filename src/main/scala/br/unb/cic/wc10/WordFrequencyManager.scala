package br.unb.cic.wc10

import scala.collection.mutable.HashMap
import scala.collection.immutable.ListMap

class WordFrequencyManager {

  val table: HashMap[String, Int] = new HashMap()

  def mapWord(word: String)  {
    if(table.contains(word)) {
      val count = table(word) + 1
      table += (word -> count)
    }
    else {
      table += (word -> 1) 
    }
  }

  def frequentWords(n: Int = 20) =
    ListMap(table.toSeq.sortWith(_._2 > _._2):_*).take(n)

}
