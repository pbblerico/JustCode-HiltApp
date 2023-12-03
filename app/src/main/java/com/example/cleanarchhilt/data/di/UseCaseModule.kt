package com.example.cleanarchhilt.data.di

import com.example.cleanarchhilt.data.repositories.DogFactRepository
import com.example.cleanarchhilt.data.useCases.DogFactUseCase
import com.example.cleanarchhilt.data.useCases.DogFactUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object UseCaseModule {

    @Provides
    fun provideDogUseCase(repo: DogFactRepository): DogFactUseCase= DogFactUseCaseImpl(repo)

}