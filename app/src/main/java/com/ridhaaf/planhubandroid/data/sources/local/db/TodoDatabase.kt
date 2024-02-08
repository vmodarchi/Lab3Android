package com.ridhaaf.planhubandroid.data.sources.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ridhaaf.planhubandroid.data.models.Todo
import com.ridhaaf.planhubandroid.data.sources.local.dao.TodoDao

@Database(
    entities = [Todo::class],
    version = 1,
)
abstract class TodoDatabase : RoomDatabase() {
    abstract val dao: TodoDao
}