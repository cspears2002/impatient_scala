import java.lang.System.*


@main def readPassword(): Unit =
    val userName = getProperty("user.name")
    println("Enter a password > ")
    val con = console()
    val password = con.readLine()
    if (password != "secret") {
        err.println("Wrong password!")
    } else {
        out.println("Welcome!")
    }
    
    