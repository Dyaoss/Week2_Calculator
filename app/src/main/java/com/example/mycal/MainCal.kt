package com.example.mycal

fun main() {
    var cal = Calculator()
    cal.mulNum()
}

class Calculator {
    fun addNum(){
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        println("$num1 + $num2 = ${num1 + num2}")
    }
    fun subNum(){
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        println("$num1 - $num2 = ${num1 - num2}")
    }
    fun mulNum(){
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        println("$num1 x $num2 = ${num1 * num2}")
    }
    fun divNum(){
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        println("$num1 / $num2 = ${num1 / num2}")
    }
}