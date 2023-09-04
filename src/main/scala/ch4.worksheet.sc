val gameMap = Map("Baldur's Gate 3" -> 80, "Dead Space" -> 70, "Dredge" -> 25)
val discount = 0.1
val discountGames = for (k, v) <- gameMap yield (k, v - (v * discount))
println(discountGames)


   