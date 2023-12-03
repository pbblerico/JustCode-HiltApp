package com.example.cleanarchhilt.data.repositories

import com.example.cleanarchhilt.data.network.DogFactApi
import com.example.cleanarchhilt.data.network.DogFactResponse
import javax.inject.Inject

class DogFactRepositoryImpl  @Inject constructor(
    private val api: DogFactApi
): DogFactRepository {
    override suspend fun getDogFacts(): DogFactResponse? {
        val response = api.getDogFacts()
        if (response.isSuccessful) return response.body()
        else throw Exception(response.message())
    }
}