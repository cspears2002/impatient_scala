import scala.compiletime.ops.double
class Counter:
    private var value = 0
    def increment() =
        value += 1
    def current = value
    def current_=(newValue: Int) = 
        if (newValue == Int.MaxValue)
            value = 0
        else
            value = newValue


class BankAccount:
    private var balance: Double = 0
    def myBalance = balance
    def deposit(myDeposit: Double) =
        balance = balance + myDeposit
    def withdraw(myWithdrawal: Double) =
        balance = balance - myWithdrawal


class Time(private var hours: Int, private var minutes: Int):
    def currentHour = hours
    def currentHour_=(newHour: Int) =
        if newHour >= 0 && newHour <= 23 then hours = newHour
    def currentMinutes = minutes
    def currentMinutes_=(newMinutes: Int) =
        if newMinutes >= 0 && newMinutes <= 59 then minutes = newMinutes
    def minutesSinceMidnight: Int =
        (currentHour * 60) + currentMinutes
    def before(other: Time): Boolean =
        val totalMinutes = (currentHour * 60) + currentMinutes
        val otherMinutes = (other.currentHour * 60) + other.currentMinutes
        if totalMinutes < otherMinutes then true else false
    

class Person(private var privateAge: Int):
    if privateAge < 0 then privateAge = 0
    def age = privateAge
        

@main def ch5MainFunc() =
    val myCounter = Counter()
    myCounter.increment()
    myCounter.current = Int.MaxValue
    println(myCounter.current)
    myCounter.increment()
    println(myCounter.current)

    val myAccount = BankAccount()
    println(myAccount.myBalance)
    myAccount.deposit(2.50)
    println(myAccount.myBalance)
    myAccount.withdraw(1.00)
    println(myAccount.myBalance)

    val myTime = Time(7, 30)
    println(myTime.currentHour)
    println(myTime.currentMinutes)
    println(myTime.minutesSinceMidnight)
    val otherTime = Time(6, 30)
    println(myTime.before(otherTime))
    val someOtherTime = Time(8, 30)
    println(myTime.before(someOtherTime))

    val ted = Person(20)
    println(s"Ted's age: ${ted.age}")
    val babyTed = Person(-1)
    println(s"Baby Ted's age: ${babyTed.age}")