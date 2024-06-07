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
        println("첫번째 숫자를 입력해주세요. / 종료하려면 -1을 입력하세요.")
        print("-> ")
        var num1 = readln().toDouble() //나눗셈을 위해 더블형으로 받음

        if (num1.toInt() == -1) {
            println("계산기를 종료합니다.")
        } else {
            println("두번째 숫자를 입력해주세요. / 종료하려면 -1을 입력하세요.")
            print("-> ")
            var num2 = readln().toDouble()
            if (num2.toInt() == -1) {
                println("계산기를 종료합니다.")
            } else {

                println("연산자를 입력해주세요.(1 -> 더하기, 2 -> 빼기, 3 -> 곱하기, 4 -> 나누기, 5 -> 나머지)")
                println("종료하려면 -1을 입력하세요.")
                print("-> ")
                op = readln().toInt()

                when (op) {
                    -1 -> println("계산기를 종료합니다.")
                    else -> operator(op, num1, num2)
                }
            }
        }
    }

    fun operator(_op: Int, _num1: Double, _num2: Double) {
        var temp: Unit
        when (_op) {
            1 -> temp = addNum(_num1, _num2)
            2 -> temp = subNum(_num1, _num2)
            3 -> temp = mulNum(_num1, _num2)
            4 -> temp = divNum(_num1, _num2)
            5 -> temp = remNum(_num1, _num2)
            else -> println("연산자를 제대로 입력해주세요(1 -> 더하기, 2 -> 빼기, 3 -> 곱하기, 4 -> 나누기, 5 -> 나머지)")
        }
    }

    fun countinueOp(_temp: Double) {
        println("현재값 : ${_temp}")
        println("계속 연산할 다음 숫자를 입력해주세요. / 종료하려면 -1을 입력하세요.")
        print("-> ")
        var conNum2 = readln().toDouble()
        if (conNum2.toInt() == -1) {
            println("계산기를 종료합니다.")
        } else {

            println("연산자를 입력해주세요.(1 -> 더하기, 2 -> 빼기, 3 -> 곱하기, 4 -> 나누기, 5 -> 나머지)")
            println("종료하려면 -1을 입력하세요.")
            print("-> ")
            var conOp = readln().toInt()

            when (conOp) {
                -1 -> println("계산기를 종료합니다.")
                else -> operator(conOp, _temp, conNum2)
            }
        }
    }

    fun addNum(_num1: Double, _num2: Double) {
        var temp = 0.0

        println("$_num1 + $_num2 = ${_num1 + _num2}")
        println("-------------------------")
        temp = _num1 + _num2

        countinueOp(temp)
    }

    fun subNum(_num1: Double, _num2: Double) {
        var temp = 0.0

        println("$_num1 - $_num2 = ${_num1 - _num2}")
        println("-------------------------")
        temp = _num1 - _num2

        countinueOp(temp)
    }

    fun mulNum(_num1: Double, _num2: Double) {
        var temp = 0.0

        println("$_num1 x $_num2 = ${_num1 * _num2}")
        println("-------------------------")
        temp = _num1 * _num2

        countinueOp(temp)
    }

    fun divNum(_num1: Double, _num2: Double) {
        var temp = 0.0
        println("$_num1 / $_num2 = ${_num1 / _num2}")
        println("-------------------------")
        temp = _num1 / _num2

        countinueOp(temp)
    }

    fun remNum(_num1: Double, _num2: Double) {
        var temp = 0.0
        println("$_num1 % $_num2 = ${_num1 % _num2}")
        println("-------------------------")
        temp = _num1 % _num2

        countinueOp(temp)
    }
}