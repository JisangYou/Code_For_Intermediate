package com.example.rxkotlin

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.toObservable
import org.junit.Test

class ObserverTest2 {
    @Test
    fun test1() {
        val observer: Observer<Any> = object : Observer<Any> {
            override fun onSubscribe(d: Disposable) {
                println("Subscribed to $d")
            }

            override fun onNext(t: Any) {
                println("Next $t")
            }

            override fun onError(e: Throwable) {
                println("Error Occured $e")
            }

            override fun onComplete() {
                println("All Completed")
            }

        }
        val observable: Observable<Any> =
            listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f).toObservable()
        observable.subscribe(observer)

        val observableOnList: Observable<List<Any>> =
            Observable.just(
                listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f),
                listOf("List with Single Item"),
                listOf(1, 2, 3, 4, 5, 6)
            )
        observableOnList.subscribe(observer)
    }

    @Test
    fun observableCreate() {
        val observer: Observer<String> = object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                println("New Subscription")
            }

            override fun onNext(t: String) {
                println("Next $t")
            }

            override fun onError(e: Throwable) {
                println("Error Occured ${e.message}")
            }

            override fun onComplete() {
                println("All Completed")
            }
        } // Observer 생성

        val observable: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onComplete()
        }

        observable.subscribe(observer)

        val observable2: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onError(Exception("My Custom Exception"))
        }
        observable2.subscribe(observer)
    }
}