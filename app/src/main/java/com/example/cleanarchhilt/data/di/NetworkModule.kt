package com.example.cleanarchhilt.data.di

import com.example.cleanarchhilt.data.network.DogFactApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    @Singleton
    @dogApi
    fun provideUrl() = "https://dog-api.kinduff.com/"

    @Provides
    @Singleton
    @dogApi
    fun getDogsRetrofit(@dogApi url: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideDogsApi(@dogApi retrofit: Retrofit): DogFactApi {
        return retrofit.create(DogFactApi::class.java)
    }
}

@Qualifier
annotation class dogApi
