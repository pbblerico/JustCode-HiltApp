package com.example.cleanarchhilt

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanarchhilt.data.network.DogFactResponse
import com.example.cleanarchhilt.data.repositories.DogFactRepository
import com.example.cleanarchhilt.data.useCases.DogFactUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val getDogFacts: DogFactUseCase
): BaseViewModel() {

    private var _factsData = MutableLiveData<DogFactResponse>()
    val factsData: LiveData<DogFactResponse> = _factsData


    fun getDogFacts() {
        launch(
            request = {
                getDogFacts.execute()
            },
            onSuccess = {facts ->
                facts?.let {
                    _factsData.postValue(it)
                }
            }
        )
    }
}