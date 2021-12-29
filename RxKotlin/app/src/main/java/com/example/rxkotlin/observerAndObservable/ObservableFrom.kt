package com.example.rxkotlin.observerAndObservable

import io.reactivex.Observable
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit


fun main() {
//    // case 1
//    val list = listOf("String 1", "String 2", "String 3", "String 4")
//    val observableFromIterable: Observable<String> = Observable.fromIterable(list)
//    observableFromIterable.subscribe(observer)

//    // case 2
//    val callable = Callable<String> { "From Callable" }
//    val observableFromCallable: Observable<String> = Observable.fromCallable(callable)
//    observableFromCallable.subscribe(observer)

    // case 3
    val future: Future<String> = object : Future<String> {
        override fun cancel(mayInterruptIfRunning: Boolean): Boolean = false

        override fun isCancelled(): Boolean = false

        override fun isDone(): Boolean = true

        override fun get(): String = "Check Hello From Future"

        override fun get(timeout: Long, unit: TimeUnit?): String = "Hello From Future"

    }

    val observableFromFuture: Observable<String> =
        Observable.fromFuture(future)
    observableFromFuture.subscribe(observer)
}