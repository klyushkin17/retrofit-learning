package com.example.retrofit_learning_app

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(
         //@Query("key") apiKey: String
    ): Response<List<TodoDto>>

    /*@POST("/createTodo")
    suspend fun createTodo(
        @Body todo: TodoDto
    ): Response<CreateTodoResponse>*/
}