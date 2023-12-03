package com.example.cleanarchhilt.data.di

import com.example.cleanarchhilt.data.network.DogFactApi
import com.example.cleanarchhilt.data.repositories.DogFactRepository
import com.example.cleanarchhilt.data.repositories.DogFactRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideDogFactRepository(api: DogFactApi): DogFactRepository = DogFactRepositoryImpl(api)
}