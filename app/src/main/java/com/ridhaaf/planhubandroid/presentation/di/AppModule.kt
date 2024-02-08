package com.ridhaaf.planhubandroid.presentation.di

import android.app.Application
import androidx.room.Room
import com.ridhaaf.planhubandroid.data.repositories.TodoRepositoryImpl
import com.ridhaaf.planhubandroid.data.sources.local.db.TodoDatabase
import com.ridhaaf.planhubandroid.domain.repositories.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app, TodoDatabase::class.java, "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.dao)
    }
}