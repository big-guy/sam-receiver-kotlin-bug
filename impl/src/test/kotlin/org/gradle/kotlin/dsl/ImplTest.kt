package org.gradle.kotlin.dsl

import org.gradle.api.Action

class Foo()

fun Foo.someMethod(): Unit = TODO()

val Foo.delegateProperty get() = 42

fun onFoo(action: Action<Foo>) {
    action.execute(Foo())
}

fun test() {
    onFoo {
        someMethod()
        println(delegateProperty)
    }
}