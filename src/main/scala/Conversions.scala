import scala.compiletime.ops.double


abstract class UnitConversion() {
    def convert(units: Double): Double
}


object InchesToCentimeters extends UnitConversion() {
    override def convert(inches: Double): Double =
        inches * 2.54
}


object GallonsToLiters extends UnitConversion() {
    override def convert(gallons: Double): Double =
        gallons * 3.78541
}

object MilesToKilometers extends UnitConversion() {
    override def convert(miles: Double): Double =
        miles * 1.60934
}


@main def convertStuff(): Unit =
    val cm = InchesToCentimeters.convert(1)
    println(s"1 inch = $cm cm")
    val liters = GallonsToLiters.convert(1)
    println(s"1 gallon = $liters liters")
    val km = MilesToKilometers.convert(1)
    println(s"1 mile = $km km")