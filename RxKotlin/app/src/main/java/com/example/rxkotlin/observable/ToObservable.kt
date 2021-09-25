package com.example.rxkotlin.observable

import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable


fun main() {
    val list: List<String> = listOf("String1", "String2", "String3", "String4")
    val observable: Observable<String> = list.toObservable()
    observable.subscribe(observer)
}