package com.example.cleanarchhilt.data.useCases

import com.example.cleanarchhilt.data.network.DogFactResponse

interface DogFactUseCase {
    suspend fun execute(): DogFactResponse?
}