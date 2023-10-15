import scala.io.*

@main def ch4MainFunc() =
    // getSysProps()

    // val minMaxOpt = minMax(Array(2, 1, 4, 5, 3))
    // if minMaxOpt.isEmpty
    //     then println("Empty array")
    //     else println(minMaxOpt.get)

    // val emptyArray = Array[Int]()
    // if emptyArray.isEmpty
    //     then println("Empty array")
    //     else println(minMaxOpt.get)

    findMatch()

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


def getSysProps(): Unit =
    import java.lang.System
    import scala.jdk.CollectionConverters.*
    val sysProps = System.getProperties.asScala
    val width = sysProps.keys.reduce((a, i) => if (a.size < i.size) i else a).size
    for (k, v) <- sysProps do println(k + (" " * (width - k.length())) + " | " + v)


def minMax(x: Array[Int]): Option[(Int, Int)] =
    if (x.isEmpty) {
        None
    } else {
        Some(x.min, x.max)
    }


def findMatch(): Unit =
    val firstLetter = StdIn.readLine("First letter: ")
    println(s"first: $firstLetter")
    val lastLetter = StdIn.readLine("Second letter: ")
    println(s"last: $lastLetter")

    // Open file and create an array of strings
    val textFile = "/usr/share/dict/words"
    val words = Source.fromFile(textFile).mkString.split("\n")
    val matches = words.find(word => (word.startsWith(firstLetter) && word.endsWith(lastLetter)))
    println(matches.get)