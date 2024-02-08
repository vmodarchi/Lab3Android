package com.ridhaaf.planhubandroid.domain.repositories

import com.ridhaaf.planhubandroid.data.models.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int?): Todo?

    fun getTodos(): Flow<List<Todo>>
}