package com.example.myapplication.ui

import androidx.lifecycle.MutableLiveData

class MainviewModel {
    private val preguntas:  MutableList<String> = mutableListOf<String>()

    val _preguntas:MutableList<String>
        get() = preguntas


    private val palabra = MutableLiveData<String>()
    val _palabra: MutableLiveData<String>
        get() = palabra

    private val tamaño = MutableLiveData<Int>()
    val _tamaño: MutableLiveData<Int>
        get() = tamaño

    init {
        _tamaño.value = 0
    }

    fun getQuestions() : MutableList<String>{
        return preguntas
    }

    fun addQuestion(string: String) {
        preguntas.add(string)
        _tamaño.value = (_tamaño.value)?.plus(1)
    }

}