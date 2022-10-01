package com.example.functions.fonksiyonlar

class Functions {
    fun convertToFah(cel: Double): Double {
        return (cel * 1.8) + 32
    }

    fun calculatePerimeter(shortEdge: Double, longEdge: Double): Double {
        return (shortEdge * 2) + (longEdge * 2)
    }

    fun factorial(num: Int): Int{
        var temp = 1
        for(i in 1..num) {
            temp *= i
        }
        return temp
    }

    fun charCounter(word: String,charToLookFor: Char): Int{
        var counter = 0
        for(i in word.indices) {
            if(charToLookFor == word[i]){
                counter++
            }
        }
        return counter
    }

    fun sumOfAngels(edgeNum: Int): Int {
        return (edgeNum - 2) * 180
    }

    fun salaryCalculator(dayNum: Int):Int{
        val hours = dayNum * 8
        val salary: Int = if(hours <= 160){
            hours * 10
        }else{
            (160 * 10)+((hours - 160) * 20)
        }
        return salary
    }

    fun billCalculator(gbsUSed:Int):Int {
        val bill: Int = if (gbsUSed <= 50) {
            100
        } else {
            100 + ((gbsUSed - 50) * 4)
        }
        return bill
    }
}