import scala.collection.mutable.ArrayBuffer

class MyStack(val buf: ArrayBuffer[String] = ArrayBuffer[String]()):
    export buf.{addOne, length, remove}

    def push(elem: String): MyStack = 
        buf.addOne(elem)
        this

    def pop(): String =
        buf.remove(buf.length - 1)


@main def createStack(): Unit =
    val myStack = MyStack()
    println(s"Stack length is ${myStack.length}")
    println("Add an element: 'a string'")
    myStack.push("a string")
    println(s"Stack length is ${myStack.length}")
    val elem = myStack.pop()
    println(s"Pop off an element: ${elem}")
    println(s"Stack length is ${myStack.length}")
