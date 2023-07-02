@main def hello: Unit =
  println("Hello world!")
  println(msg)

  println(product("Hello"))

def msg = "I was compiled by Scala 3. :)"

def product(s: String) = 
  var x: Long = 1
  for (c <- s)
    x *= c.toInt
  x
