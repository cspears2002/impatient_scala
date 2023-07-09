import scala.math._

@main def hello: Unit =
  println("Hello world!")
  println(msg)

  println(product("Hello"))

  println(powerOf(2, 2))
  println(powerOf(2, 3))
  println(powerOf(2, 0))
  println(powerOf(2, -1))

def msg = "I was compiled by Scala 3. :)"


def product(s: String): Long =
  var x: Long = 1
  if s.length() == 1 then
    x * s.head.toLong
  else
    x * s.head.toLong * product(s.tail)


def powerOf(x: Int, n: Int): Double =
  val remainder = n % 2
  if (n > 0) then
    if (remainder == 0) then
      val y = powerOf(x, n/2)
      y * y
    else
      val diff = n - 1
      x * powerOf(x, diff)
  else if (n == 0) then
    1
  else
    1 / powerOf(x, -1*n)
  
