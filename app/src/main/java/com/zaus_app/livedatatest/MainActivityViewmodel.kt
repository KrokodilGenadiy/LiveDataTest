package com.zaus_app.livedatatest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewmodel: ViewModel() {
    val liveDataCounter = MutableLiveData<Int>()
    var i = 0

    fun Increment() {
        liveDataCounter.postValue(i++)
    }
}