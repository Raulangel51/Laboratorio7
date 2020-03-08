package com.example.laboratorio6.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

//tabla de rspuestas
@Entity(tableName = "answer_table", foreignKeys = [ForeignKey(entity = Question::class,
    parentColumns = ["questionId"], childColumns = ["questionId"], onDelete = CASCADE) ,
    ForeignKey(entity = Survey::class, parentColumns = ["surveyId"],
        childColumns = ["surveyId"], onDelete = CASCADE)])
data class Answer(

        //llave primaria de respuesta, se autogenera
        @PrimaryKey(autoGenerate = true)
        var answerId: Long = 0L,

        //id de la encuesta
        @ColumnInfo(name = "survey_id")
        var surveyId: Long = 0L,

        //id de la pregunta que es
        @ColumnInfo(name = "question_id")
        var questionId: Long = 0L,

        //respuesta si es de texto la pregunta
        @ColumnInfo(name = "answer_text")
        var answerText: String = "",

        //respuesta si es numero
        @ColumnInfo(name = "answer_number")
        var answerNumber: Int = 0


)