package com.example.laboratorio6.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//tabla de preguntas
@Entity(tableName = "question_table")
data class Question(

    //lave primario de la tabla se autogenera
    @PrimaryKey(autoGenerate = true)
    var questionId: Long = 0L,

    //campo de pregunta
    @ColumnInfo(name = "pregunta")
    var name: String = "",

    //campo del tipo depregunta
    @ColumnInfo(name = "tipo")
    var type: String = "",

    //cambio de default, esto solo sera true para las estrellas y lo que opina el usuario
    @ColumnInfo(name = "default")
    var default: Boolean = false
)