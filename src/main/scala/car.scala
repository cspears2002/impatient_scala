class Car(val manufacturer: String, val model: String, val year: Int = -1, var license: String = ""):
    
    def description() = s"$manufacturer $model $year license plate: $license"


@main def mainFunc() =

    val myCar1 = Car("Toyota", "Prius", 2016, "MYCAR")
    println(myCar1.description())
    val myCar2 = Car("Toyata", "Prius", 2016)
    println(myCar2.description())
    val myCar3 = Car("Toyota", "Prius", license="MY OTHER CAR")
    println(myCar3.description())
    val myCar4 = Car("Toyata", "Prius")
    println(myCar4.description())