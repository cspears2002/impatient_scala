/* Take two dates from the user in the following format:
    2023-07-29 (yyyy-mm-dd)

    The script will print the number of days between the
    two days.

    Usage:
        scala daysBetween.scala 2023-07-29 2023-08-01
*/

import java.time.*
import java.time.temporal.ChronoUnit

@main def daysBetween(startDate: String, endDate: String) = 
    val start = LocalDate.parse(startDate)
    val end = LocalDate.parse(endDate)
    val daysBetween = ChronoUnit.DAYS.between(start, end).abs
    println(s"$daysBetween days between $start and $end")
