package com.example.cleanarchhilt.data.useCases

import com.example.cleanarchhilt.data.network.DogFactResponse
import com.example.cleanarchhilt.data.repositories.DogFactRepository
import javax.inject.Inject

class DogFactUseCaseImpl @Inject constructor(
    private val repo: DogFactRepository
): DogFactUseCase {
    override suspend fun execute(): DogFactResponse? {
        return repo.getDogFacts()
    }

}