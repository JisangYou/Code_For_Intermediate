package Chapter2

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main() {
    val range1 = 1..10
    val range2 = 100 downTo 0 step 2
    val range3 = 100 downTo 2 step 2

    for (i in range2) {
        print(fizzBuzz(i))
    }
    for (i in range3) {
        print(fizzBuzz(i))
    }
}