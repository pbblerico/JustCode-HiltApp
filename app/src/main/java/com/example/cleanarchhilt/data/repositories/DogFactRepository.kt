package com.example.cleanarchhilt.data.repositories

import com.example.cleanarchhilt.data.network.DogFactResponse

interface DogFactRepository {
    suspend fun getDogFacts(): DogFactResponse?
}