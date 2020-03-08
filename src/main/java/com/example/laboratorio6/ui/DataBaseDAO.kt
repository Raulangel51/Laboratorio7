package com.example.laboratorio6.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//donde se almacenan los funciones para guardar, eliminar o jalar datos de la base de datos
@Dao
interface DataBaseDAO {


    @Insert
    fun insert(respuesta: Answer)

    @Update
    fun update(respuesta: Answer)

    //selecciona los datos de la tabla para mostrar todo
    @Query("SELECT * FROM answer_table ORDER BY answerId DESC")
    fun getTonight(): Answer?

    //elimina las respuestas
    @Query("DELETE FROM answer_table")
    fun clear()

    //elimina las encuenstas
    @Query("DELETE  FROM survey_table")
    fun clearSurvey()

    //eliminar preguntas
    @Query("DELETE FROM question_table")
    fun clearQuestions()

    //jala las preguntas guardadas
    @Query("SELECT pregunta FROM question_table")
    fun questions()




}