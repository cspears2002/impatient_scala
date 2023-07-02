@main def hello: Unit =
  println("Hello world!")
  println(msg)

  println(product("Hello"))

def msg = "I was compiled by Scala 3. :)"

def product(s: String): Long =
  var x: Long = 1
  if s.length() == 1 then
    x * s.head.toLong
  else
    x * s.head.toLong * product(s.tail)
  
