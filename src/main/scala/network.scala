import scala.collection.mutable.ArrayBuffer


class Network:
    class Member(val name: String):
        val contacts = ArrayBuffer[Member]()

        def equals(member: Member) =
            members.contains((member))

    private val members = ArrayBuffer[Member]()

    def join(name: String) = 
        val m = Member(name)
        members += m
        m


@main def makeNetworks() =
    val chatter = Network()
    val myFace = Network()

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    println(fred.equals(wilma))
    fred.contacts += wilma

    val barney = myFace.join("Barney")
    println(fred.equals(barney))