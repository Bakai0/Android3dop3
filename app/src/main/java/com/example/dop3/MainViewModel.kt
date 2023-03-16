package com.example.dop3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private var list: MutableLiveData<Int> = MutableLiveData()

    fun random(): MutableLiveData<Int> {
        var rand = Random.nextInt(100)
        list.value= rand
        return list
    }

}


