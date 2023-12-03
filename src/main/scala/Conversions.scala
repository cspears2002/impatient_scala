import scala.compiletime.ops.double

object Conversions {
  def inchesToCentimeters(inches: Double): Double =
    inches * 2.54

  def gallonsToLiters(gallons: Double): Double =
    gallons * 3.78541

  def milesToKilometers(miles: Double): Double =
    miles * 1.60934
}


@main def convertStuff(): Unit =
    val cm = Conversions.inchesToCentimeters(1)
    println(s"1 inch = $cm cm")
    val liters = Conversions.gallonsToLiters(1)
    println(s"1 gallon = $liters liters")
    val km = Conversions.milesToKilometers(1)
    println(s"1 mile = $km km")