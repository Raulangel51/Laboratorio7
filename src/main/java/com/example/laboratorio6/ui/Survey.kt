package com.example.laboratorio6.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

//tabla de las encuestas
@Entity(tableName= "survey_table")
data class Survey(
    //llave primaria de la tabla se genera automaticamente
    @PrimaryKey(autoGenerate = true)
    var poll_id: Long =0L,

    //la fecha de creacion de la pregunta
    @ColumnInfo(name = "created_date")
    var created_date: String = ""
)