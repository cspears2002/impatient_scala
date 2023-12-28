import game.com.* 

@main def makeAGuess: Unit =
    val randomNum = game.com.random()

    println("Enter a number between 0 and 5: ")
    val userNum = scala.io.StdIn.readInt()
    if userNum < 0 || userNum > 5 then
        println("Number must be between 0 and 5")
    else if userNum == randomNum then
        println("Congrats!  You win!")
    else
        println("Sorry!  You lost!")


    