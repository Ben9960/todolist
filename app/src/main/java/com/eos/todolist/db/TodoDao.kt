package com.eos.todolist.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Query

@Dao
interface TodoDao {
    @Insert
    fun insertTodo(todo: TodoEntity)

    @Delete
    fun deleteToDo(todo: TodoEntity)

    @Query("SELECT * FROM TodoEntity")
    fun getAll() : List<TodoEntity>
}