import scala.util.Random

@main def mainFunc() =
    println("Hello world!")
    val arrayOfInt = randArrayOfInts(5)
    arrayOfInt.foreach(println)

def randArrayOfInts(n: Int): Array[Int] =
    val rand = Random()
    val idxSeq = (0 to (n-1)).map(_ => rand.nextInt())
    idxSeq.toArray