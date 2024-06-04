package com.example.mycal

fun main() {
    var cal = Calculator()
    cal.addNum()
}

class Calculator {
    fun addNum(){
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var sum = num1 + num2
        println("결과: $sum")
    }
}