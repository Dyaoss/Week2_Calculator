package com.example.mycal

fun main() {
    var cal = Calculator()
    cal.addNum(1,2)
}

class Calculator {
    fun addNum(num1: Int, num2: Int){
        println("결과: ${num1+num2}")
    }
}