package com.example.kotlinbasics

fun main(){
   var anshu=member()
    var name = member("Nisha","Singh", 18)
}
class member(firstName: String = "Anshu", lastName: String ="Kumar", age: Int = 20){
    var age : Int ?= null
    init {
        println("$firstName $lastName $age" )
    }
}
