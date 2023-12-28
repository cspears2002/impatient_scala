package random

import scala.math._

val a = 1664525
val b = 1013904223
val n = 32
var seedValue = 0

def setSeed(seed: Int): Unit =
    seedValue = seed

def nextInt(): Int =
    val num = (seedValue * a * b) % pow(2, n)
    num.toInt

def nextDouble(): Double =
    (seedValue * a * b) % pow(2, n)

