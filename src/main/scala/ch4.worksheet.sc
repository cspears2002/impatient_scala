val gameMap = Map("Baldur's Gate 3" -> 80, "Dead Space" -> 70, "Dredge" -> 25)
val discount = 0.1
val discountGames = for (k, v) <- gameMap yield (k, v - (v * discount))
println(discountGames)

import java.util.Calendar
val dayMap = scala.collection.mutable.LinkedHashMap("Sunday" -> java.util.Calendar.SUNDAY,
                                                    "Monday" -> java.util.Calendar.MONDAY,
                                                    "Tuesday" -> java.util.Calendar.TUESDAY,
                                                    "Wednesday" -> java.util.Calendar.WEDNESDAY,
                                                    "Thursday" -> java.util.Calendar.THURSDAY,
                                                    "Friday" -> java.util.Calendar.FRIDAY,
                                                    "Saturday" -> java.util.Calendar.SATURDAY)
println(dayMap.keySet)

   