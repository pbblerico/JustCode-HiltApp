package com.example.cleanarchhilt.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DogFactApi {
    @GET("api/facts")
    suspend fun getDogFacts(
        @Query("number") number: Int = 5
    ): Response<DogFactResponse>
}