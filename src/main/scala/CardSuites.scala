enum Suit(val symbol: String):
    case Spades extends Suit("\u2660")
    case Diamonds extends Suit("\u2666")
    case Clubs extends Suit("\u2663")
    case Hearts extends Suit("\u2764")
    override def toString(): String = 
        symbol

@main def playCards() =
    println(Suit.Spades.toString())
    println(Suit.Diamonds.toString())
    println(Suit.Clubs.toString())
    println(Suit.Hearts.toString())
