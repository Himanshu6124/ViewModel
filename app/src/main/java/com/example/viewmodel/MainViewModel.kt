package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     var count :MutableLiveData<Int> = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun incrementCount() {
        count.value = count.value?.plus(1)
    }

    fun getCount(): Int? {
        return count.value
    }
}