package com.example.mycal

fun main() {
    var cal = Calculator()
    cal.calculator()
}

class Calculator {
    var num1: Double = 0.0
    var num2: Double = 0.0


    init {
        println("계산기 시작!")
    }

    fun calculator() {
        var op: String

        println("숫자를 입력해주세요.")
        var num1 = readln().toDouble()
        var num2 = readln().toDouble()
        println("연산자를 입력해주세요.(+,-,*,/)")
        op = readln()
        when (op) {
            "" -> println("연산자를 입력해주세요!")
            "+" -> addNum(num1,num2)
            "-" -> subNum(num1,num2)
            "*" -> mulNum(num1,num2)
            "/" -> divNum(num1,num2)
            else -> println("연산자를 제대로 입력해주세요(+,-,*,/)")
        }
    }

    fun addNum(_num1:Double,_num2:Double) {
        println("$_num1 + $_num2 = ${_num1 + num2}")
    }

    fun subNum(_num1:Double,_num2:Double) {
        println("$_num1 - $_num2 = ${_num1 - _num2}")
    }

    fun mulNum(_num1:Double,_num2:Double) {
        println("$_num1 x $_num2 = ${_num1 * _num2}")
    }

    fun divNum(_num1:Double,_num2:Double) {
        println("$_num1 / $_num2 = ${_num1 / _num2}")
    }
}