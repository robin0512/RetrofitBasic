package com.example.retrofitbasic.api

import com.example.retrofitbasic.models.ResponseListUsers
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/users?delay=3")
    suspend fun getAllUsers(): Response<ResponseListUsers>
}