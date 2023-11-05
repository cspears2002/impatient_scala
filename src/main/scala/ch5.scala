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


class Time:
    private var hours: Int = 0
    private var minutes: Int = 0
    def currentHour = hours
    def currentHour_=(newHour: Int) =
        if newHour >= 0 && newHour <= 23 then hours = newHour
    def currentMinutes = minutes
    def currentMinutes_=(newMinutes: Int) =
        if newMinutes >= 0 && newMinutes <= 59 then minutes = newMinutes
    

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

    val myTime = Time()
    myTime.currentHour = 7
    myTime.currentMinutes = 30
    println(myTime.currentHour)
    println(myTime.currentMinutes)