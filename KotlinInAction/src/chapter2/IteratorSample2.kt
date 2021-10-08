package chapter2

import java.util.*

fun main() {
    iteratorMap()
    iteratorList()
    checkWithIn()
}

// 구조 분해
val binaryReps = TreeMap<Char, String>()
fun iteratorMap() {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

val list = arrayListOf("10", "11", "1001")
fun iteratorList() {
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

// in
fun isLetter(c: Char) = c in 'a'..'z' || 'c' in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun checkWithIn() {
    println(isLetter('q'))
    println(isNotDigit('x'))
}