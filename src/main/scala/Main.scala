import br.unb.cic.wc10.{DataStorageManager, StopWordManager, WordFrequencyManager}

import java.io.File
import java.io.PrintWriter
import scala.io.Source
import org.backuity.clist._

object Controller extends CliMain[Unit] (
  name="Word Count",
  description="a simple word count implementation using the \"Things\" style") {

  var input = arg[String](description = "the input file")
  var stopWordsPath = arg[String](description = "path to the stop words file")
  var size  = opt[Int](default = 20)

  def run: Unit = {
    val sm = new DataStorageManager(Source.fromFile(input))
    val sw = new StopWordManager(Source.fromFile(stopWordsPath))
    val wf = new WordFrequencyManager()

    while(sm.hasNext) {
      val word = sm.next()
      if(!sw.isStopWord(word)) {
        wf.mapWord(word)
      }
    }
    wf.frequentWords(size).foreach(r => println(r))
    println(sm.size)
  }
}
