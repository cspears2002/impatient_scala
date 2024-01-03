import scala.collection.mutable.ArrayBuffer

class MyQueue(val buf: ArrayBuffer[String] = ArrayBuffer[String]()):
    export buf.{foreach, insert, length, remove}

    /* Remove an element from the front of the queue */
    def dequeue(): String = 
        buf.remove(0)

    /* Add an element to the front of the queue */
    def enqueue(elem: String): MyQueue =
        buf.insert(0, elem)
        this

@main def useQueue(): Unit =
    val myQueue = MyQueue()
    myQueue.enqueue("a")
    myQueue.enqueue("b")
    myQueue.enqueue("c")

    myQueue.foreach(println)
    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())