package Chapter2


import java.lang.Exception
import Chapter2.Color.*

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {

    mix(YELLOW, BLUE)
//    print(mix(YELLOW, BLUE))
    println(getWarmth(ORANGE))

}

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) {
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> println(ORANGE)
        setOf(YELLOW, BLUE) -> println(GREEN)
        setOf(BLUE, VIOLET) -> println(INDIGO)
        else -> throw Exception("Dirty color")
    }
}