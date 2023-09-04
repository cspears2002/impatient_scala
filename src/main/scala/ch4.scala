import scala.io.Source

@main def ch4MainFunc() =
    readMyFile()

def readMyFile(): Unit =
    var wordCount = java.util.TreeMap[String, Int]()

    var source = Source.fromFile("myfile.txt")
    var lineIterator = source.getLines()
    for l <- lineIterator do
        for w <- l.split("\\s+") do
            val word = w.replaceAll("\\p{Punct}", "")
            if wordCount.containsKey(word) then
                val count = wordCount.get(word) + 1
                wordCount.put(word, count)
            else
                wordCount.put(word, 1)
    
    wordCount.forEach((k, v) => println(s"$k: $v"))

