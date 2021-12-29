package com.example.rxkotlin.observerAndObservable

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

fun main() {
    // 관찰되야 하는 대상
    // 어떤 데이터를 관찰할 수 있는 형태로 바꾸는 역할
    // 관찰 할 수 있는, 어떤 데이터를 observer 처리할 수 있도록 포장
    val observable: Observable<Int> = Observable.range(1, 5)
    observable.subscribe({
        println("Next $it")
    }, {
        println("Error ${it.message}")
    }, {
        println("Done")
    })

    // 관찰해아하는 주체 !!
    // observable에서 관찰 할 수 있는 형태로 전달한 데이터를 받고 이에 대한 액션
    val observer: Observer<Int> = object : Observer<Int> {
        override fun onSubscribe(d: Disposable) {
            println("onSubscribe")
        }

        override fun onNext(t: Int) {
            println("onNext : $t")
        }

        override fun onError(e: Throwable) {
            println("e : $e")
        }

        override fun onComplete() {
            println("onComplete")
        }
    }

    observable.subscribe(observer)

}