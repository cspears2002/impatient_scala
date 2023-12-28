package com:
    def callCom(): Unit =
        print("I'm com!")

package horstman:
    def callHorstman(): Unit = 
        print("I'm Horstman!")

package impatient:
    def imImpatient(): Unit =
        println("I'm impatient!")

@main def callImpatient(): Unit =
    impatient.imImpatient()