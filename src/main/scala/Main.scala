import java.time.LocalDate
import scala.math._

@main def hello: Unit =
  println("Hello world!")
  println(msg)

  println(product("Hello"))
  
  println(powerOf(2, 2))
  println(powerOf(2, 3))
  println(powerOf(2, 0))
  println(powerOf(2, -1))

  date"2022-7-9"

  val year = 2023
  val month = 7
  val day = 9
  date"$year-$month-$day"

  val thisYear = 2023
  date"$thisYear-7-22"

  val thisMonth = 7
  date"2023-$thisMonth-22"

  val thisDay = 22
  date"$thisYear-7-$thisDay"

  
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


implicit class MyDateInterpolator(val sc: StringContext) extends AnyVal {
  def date(args: Any*): LocalDate = {
    val dateStr = sc.s(args: _*)
    val dateStrArray = dateStr.split("-")
    val year = dateStrArray(0).toInt
    val month = dateStrArray(1).toInt
    val day = dateStrArray(2).toInt
    LocalDate.of(year, month, day)
  }
}


  
