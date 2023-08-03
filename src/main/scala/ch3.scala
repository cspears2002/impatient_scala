import scala.collection.mutable.ArrayBuffer

import scala.util.Random

@main def mainFunc() =
    val arrayOfInt = randArrayOfInts(5)
    arrayOfInt.foreach(println)

    val swapped = swapInts(Array(1, 2, 3, 4, 5))
    swapped.foreach(println)


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

    