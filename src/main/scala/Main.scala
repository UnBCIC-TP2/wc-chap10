import java.io.File
import java.io.PrintWriter

import wc._

import org.backuity.clist._

object MainProgram extends CliMain[Unit] (
  name="Word Count",
  description="a simple word count implementation using the \"Things\" style") {

  var input = arg[String](description = "the input file")
  var size  = opt[Int](default = 20)

  def run: Unit = {
    val sm = new DataStorageManager(input)
    val wf = new WordFrequencyManager()

    while(sm.hasNext) {
      val word = sm.next()
      if(!StopWord.isStopWord(word)) {
        wf.mapWord(word)
      }
    }
    wf.frequentWords(size).foreach(r => println(r))
    println(sm.size)
  }
}
