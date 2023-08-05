import scala.collection.mutable.ArrayBuffer

import scala.util.Random

@main def mainFunc() =
    val arrayOfInt = randArrayOfInts(5)
    arrayOfInt.foreach(println)

    val swapped = swapInts(Array(1, 2, 3, 4, 5))
    swapped.foreach(println)

    val swapped2 = swapInts2(Array(1, 2, 3, 4, 5))
    swapped2.foreach(println)

    val myArray = Array(1, 0, -5, 2, 4)
    // Want Array(1, 2, 4, 0, -5)


def randArrayOfInts(n: Int): Array[Int] =
    val rand = Random()
    val idxSeq = (0 to (n-1)).map(_ => rand.nextInt())
    idxSeq.toArray


def swapInts(x: Array[Int]): Array[Int] = 
    for i <- 0 until x.length - 1 by 2 do
        val temp = x(i)
        x(i) = x(i+1)
        x(i+1) = temp
    x


def swapInts2(x: Array[Int]): Array[Int] = 
    (for {y <- x.grouped(2); z <- y.reverse} yield z).toArray
    