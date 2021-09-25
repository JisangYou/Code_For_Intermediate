package com.example.rxkotlin.observable

import io.reactivex.Observable


fun main() {
    // case 1
    println("case 1 =====")
    Observable.just("A String").subscribe(observer)
    // case 2
    println("case 2 =====")
    Observable.just("54").subscribe(observer)

    // case 3
    println("case 3 =====")
    Observable.just(listOf("String 1", "String 2", "String 3", "String 4")).subscribe(observer)
    // case 4
    println("case 4 =====")
    Observable.just(
        mapOf(
            Pair("Key 1", "Value 1"),
            Pair("Key 2", "Value 2"),
            Pair("Key 3", "Value 3"),
            Pair("Key 4", "Value 4")
        )
    ).subscribe(observer)
    // case 5
    println("case 5 =====")
    Observable.just(arrayListOf(1, 2, 3, 4, 5, 6)).subscribe(observer)
    // case 6
    println("case 6 =====")
    Observable.just("String 1", "String 2", "String 3", "String 4").subscribe(observer)

}