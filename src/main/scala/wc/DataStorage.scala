package wc

import scala.io.Source
import scala.collection.mutable.MutableList

/*** 
  * Iterator: Padrao de projeto para iterar em colecoes de 
  * objetos.  
  */ 
trait Iterator[T] {
  def hasNext() : Boolean
  def next() : T
  def begin: Unit
}

/***
  * Um data storage manager baseado em arquivos.  
  */ 
class DataStorageManager(val path: Source) extends Iterator[String] {

  // ------------ construtor -------------//
  val lines: List[String] = path.getLines.toList
  var words: MutableList[String] = new MutableList[String]()

  lines.foreach((s: String) => words ++= s.split(" ").toList)

  words = words.filter(s => s.size > 3) 

  var item = 0

  // ----------- construtor -------------// 

  def hasNext() = item < words.size

  def size = words.size

  def next(): String = {
    val res = words(item)
    item += 1
    return res.replaceAll("[^a-zA-Z]", "")
  }

  def begin() {
    item = 0 
  }

}
