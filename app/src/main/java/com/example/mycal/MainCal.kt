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
        var op: Int? = 0
        println("첫번째 숫자를 입력해주세요.")
        var num1 = readln().toDouble() //나눗셈을 위해 더블형으로 받음

        println("두번째 숫자를 입력해주세요.")
        var num2 = readln().toDouble()

        println("연산자를 입력해주세요.(1 -> 더하기, 2 -> 빼기, 3 -> 곱하기, 4 -> 나누기, 5 -> 나머지)")
        println("종료하려면 -1을 입력하세요.")
        op = readln().toInt()


        operator(op, num1, num2)

    }


    fun operator(_op: Int, _num1: Double, _num2: Double) {
        var themp: Unit
        when (_op) {
            1 -> themp = addNum(_num1, _num2)
            2 -> themp = subNum(_num1, _num2)
            3 -> themp = mulNum(_num1, _num2)
            4 -> themp = divNum(_num1, _num2)
            5 -> themp = remNum(_num1, _num2)
            else -> println("연산자를 제대로 입력해주세요(1 -> 더하기, 2 -> 빼기, 3 -> 곱하기, 4 -> 나누기, 5 -> 나머지)")
        }
    }

    fun addNum(_num1: Double, _num2: Double) {
        println("$_num1 + $_num2 = ${_num1 + _num2}")
    }

    fun subNum(_num1: Double, _num2: Double) {
        println("$_num1 - $_num2 = ${_num1 - _num2}")
    }

    fun mulNum(_num1: Double, _num2: Double) {
        println("$_num1 x $_num2 = ${_num1 * _num2}")
    }

    fun divNum(_num1: Double, _num2: Double) {
        println("$_num1 / $_num2 = ${_num1 / _num2}")
    }

    fun remNum(_num1: Double, _num2: Double) {
        println("$_num1 % $_num2 = ${_num1 % _num2}")
    }
}