enum SuitColor:
    case Black
    case Red

enum Suit(val symbol: String, color: SuitColor):
    case RedSpades extends Suit("\u2660", SuitColor.Red)
    case RedDiamonds extends Suit("\u2666", SuitColor.Red)
    case RedClubs extends Suit("\u2663", SuitColor.Red)
    case RedHearts extends Suit("\u2764", SuitColor.Red)
    case BlackSpades extends Suit("\u2660", SuitColor.Black)
    case BlackDiamonds extends Suit("\u2666", SuitColor.Black)
    case BlackClubs extends Suit("\u2663", SuitColor.Black)
    case BlackHearts extends Suit("\u2764", SuitColor.Black)
    override def toString(): String = 
        symbol
    def getColor(): String = color.toString()

@main def playCards() =
    println(Suit.RedSpades.toString())
    println(Suit.RedDiamonds.toString())
    println(Suit.RedClubs.toString())
    println(Suit.RedHearts.toString())
    
    println(Suit.RedClubs.getColor())
    println(Suit.BlackClubs.getColor())