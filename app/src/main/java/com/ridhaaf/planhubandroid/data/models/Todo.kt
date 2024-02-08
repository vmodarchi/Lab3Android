package com.ridhaaf.planhubandroid.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String,
    val isDone: Boolean = false,
    @PrimaryKey val id: Int? = null
)
