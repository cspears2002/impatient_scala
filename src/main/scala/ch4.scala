import scala.io.Source

@main def ch4MainFunc() =
    readMyFile()

def readMyFile(): Unit =
    val wordCount = scala.collection.mutable.Map[String, Int]()

    var source = Source.fromFile("myfile.txt")
    var lineIterator = source.getLines()
    for l <- lineIterator do
        for w <- l.split("\\s+") do
            val word = w.replaceAll("\\p{Punct}", "")
            if wordCount.contains(word) then
                val count = wordCount(word)
                wordCount(word) = count + 1
            else
                wordCount(word) = 1
    
    for (k, v) <- wordCount do
        println(s"$k: $v")

