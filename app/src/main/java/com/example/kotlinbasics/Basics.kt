package com.example.kotlinbasics

fun main(){
    // TODO: Add new functionality
   println("Hello World")

    hello()

}

fun hello(){
    println("Enter your Name")
    val message = readLine()
    var encode = ""
    if (message!= null) {
        for (x in message.length - 1 downTo 0) {
            encode += message[x]


        }
    }
    println("$encode \n")
}
