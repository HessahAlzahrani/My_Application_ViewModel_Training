package com.example.myapplicationviewmodeltraining

class ViewModel {
    // 4
    private var _score = 0
// 5 + 13

    val score get() =  _score


    // 6
    fun addOne() {
        _score += 1
    }


}