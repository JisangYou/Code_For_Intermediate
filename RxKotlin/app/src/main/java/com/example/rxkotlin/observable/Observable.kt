package com.example.rxkotlin.observable

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

val observer: Observer<String> = object : Observer<String> {
    override fun onSubscribe(d: Disposable) {
        println("New Subscription")
    }

    override fun onNext(t: String) {
        println("New $t")
    }

    override fun onError(e: Throwable) {
        println("Error Occured ${e.message}")
    }

    override fun onComplete() {
        println("All Completed")
    }
}