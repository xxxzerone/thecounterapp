package com.example.coutermvvm

data class CounterModel(var counter: Int = 0)

class CounterRepository {
    private val _counter = CounterModel()

    fun getCounter() = _counter

    fun incrementCounter() = _counter.counter++

    fun decrementCounter() = _counter.counter--
}