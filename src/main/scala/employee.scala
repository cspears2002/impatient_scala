class Employee(val name: String = "John Q. Public", var salary: Double = 0.0)


@main def mainEmployeeFunc() =
    val employee = Employee()
    println(employee.name)
    println(employee.salary)