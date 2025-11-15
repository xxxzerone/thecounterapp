package com.example.coutermvvm

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository = CounterRepository()
    private var _counter = mutableIntStateOf(_repository.getCounter().counter)

    val counter = _counter

    fun increment() {
        _repository.incrementCounter()
        counter.intValue = _repository.getCounter().counter
    }

    fun decrement() {
        _repository.decrementCounter()
        counter.intValue = _repository.getCounter().counter
    }
}