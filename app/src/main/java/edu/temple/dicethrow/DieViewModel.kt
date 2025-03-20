package edu.temple.dicethrow

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData

class DieViewModel : ViewModel() {
    private val currentRoll : MutableLiveData<Int> by lazy {
        MutableLiveData()
    }

    fun getCurrentRoll() : LiveData<Int> {
        return currentRoll
    }

    fun setCurrentRoll(roll : Int) {
        currentRoll.value = roll
    }
}