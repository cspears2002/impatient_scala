import java.util.HashMap as javaUtilHashMap
import scala.collection.mutable.HashMap as scalaHashMap

@main def copyJavaHashMap(): Unit =
    val javaHashMap = javaUtilHashMap[String, Int]
    javaHashMap.put("a", 1)
    javaHashMap.put("b", 2)
    javaHashMap.put("c", 3)

    val scalaMap = scalaHashMap[String, Int]
    javaHashMap.forEach((k, v) => println(s"${k}, ${v}"))

    
