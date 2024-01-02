import scala.collection.mutable.ArrayBuffer

class MyStack(val buf: ArrayBuffer[String] = ArrayBuffer[String]()):
    export buf.{addOne, length, remove}

    def push(elem: String): ArrayBuffer[String] = 
        buf.addOne(elem)

    def pop(): String =
        buf.remove(buf.length)

