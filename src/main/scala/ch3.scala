import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.collection.mutable.Buffer

@main def mainFunc() =
    val arrayOfInt = randArrayOfInts(5)
    arrayOfInt.foreach(println)
    println("\n")

    val swapped = swapInts(Array(1, 2, 3, 4, 5))
    swapped.foreach(println)
    println("\n")

    val swapped2 = swapInts2(Array(1, 2, 3, 4, 5))
    swapped2.foreach(println)
    println("\n")

    val myArray = Array(1, 0, -5, 2, 4)
    // Want Array(1, 2, 4, 0, -5)
    val newArray = posToNeg(myArray)
    newArray.foreach(println)
    println("\n")

    val arrayDbles: Array[Double] = Array(1.0, 2.0, 3.0, 4.0) 
    val avg = computeAvg(arrayDbles)
    println(s"The average is $avg.\n")

    val myArray2 = Array(1, 5, 3, 2)
    val sortedMyArray2 = myArray2.sorted
    val revSortedMyArray2 = sortedMyArray2.reverse
    revSortedMyArray2.foreach(println)
    println("\n")

    val arrayBuf = ArrayBuffer(5, 3, 2)
    arrayBuf.sortInPlace
    arrayBuf.reverse
    arrayBuf.foreach(println)
    println("\n")

    val arrayBuf2 = ArrayBuffer(1, -1, 2, -4, 7, 6, -9)
    val newArrayBuf = removeNegNum(arrayBuf2)
    newArrayBuf.foreach(println)
    println("\n")

    val arrayBuf3 = ArrayBuffer(1, -1, 2, -4, 7, 6, -9)
    val newArrayBuf2 = removeNegNum2(arrayBuf3)
    newArrayBuf2.foreach(println)
    println("\n")

    val tzArrayBuffer = sortTimeZones()
    tzArrayBuffer.foreach(println)
    println("\n")

    val flavorBuf = getFlavors()
    flavorBuf.foreach(println)


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


def posToNeg(myArray: Array[Int]): Array[Int] =
    val posArray: Array[Int] = myArray.filter(_ > 0)
    val zeroArray: Array[Int] = myArray.filter(_ == 0)
    val negArray: Array[Int] = myArray.filter(_ < 0)
    Array(posArray, zeroArray, negArray).flatten
    

def computeAvg(myArray: Array[Double]): Double =
    myArray.sum / myArray.length


def removeNegNum(myArrayBuffer: ArrayBuffer[Int]): ArrayBuffer[Int] =
    /* This will remove all but the first negative number from
    an array buffer.*/
    val negIdx = ArrayBuffer[Int]()
    for ((elem, i) <- myArrayBuffer.zipWithIndex) {
        // println(s"$i: $elem")
        if elem < 0 then
            negIdx.append(i)
    }
    negIdx.remove(0)
    val revNegIdx = negIdx.reverse
    revNegIdx.foreach(println)
    for (y <- revNegIdx) {
        println(s"Remove $y")
        myArrayBuffer.remove(y)
    }
    myArrayBuffer


def removeNegNum2(myArrayBuffer: ArrayBuffer[Int]): ArrayBuffer[Int] =
    var idx = 0
    var firstNeg = 0
    var found = false
    while (idx < myArrayBuffer.length && !found) do
        if myArrayBuffer(idx) < 0 then {
            firstNeg = idx
            found = true
        } else {
            idx += 1
        }
    val positionsToKeep = for i <- firstNeg + 1 to myArrayBuffer.length - 1 if myArrayBuffer(i) >= 0 yield i
    for j <- positionsToKeep.indices do {
         myArrayBuffer(j + firstNeg + 1) = myArrayBuffer(positionsToKeep(j))
    }
    myArrayBuffer.dropRightInPlace(myArrayBuffer.length - positionsToKeep.length - firstNeg - 1)
    myArrayBuffer


def sortTimeZones(): ArrayBuffer[String] =
    import java.util.TimeZone.getAvailableIDs
    val americanTZ = ArrayBuffer[String]()
    for tz <- getAvailableIDs() do
        if tz.startsWith("America") then
            americanTZ.append(tz.stripPrefix("America/"))
    americanTZ
    

def getFlavors(): Buffer[String] =
    import java.awt.datatransfer.*
    import scala.jdk.CollectionConverters.ListHasAsScala
    
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    val flavorLst = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    val flavorBuf: Buffer[String] = flavorLst.asScala
    flavorBuf