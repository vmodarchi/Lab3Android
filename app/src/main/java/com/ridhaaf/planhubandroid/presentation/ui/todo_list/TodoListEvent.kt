package com.ridhaaf.planhubandroid.presentation.ui.todo_list

import com.ridhaaf.planhubandroid.data.models.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChanged(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    data object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    data object OnAddTodoClick : TodoListEvent()
}