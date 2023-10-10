package com.example.petfinder.presenter.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.data.utils.doOnFailure
import com.example.petfinder.data.utils.doOnLoading
import com.example.petfinder.data.utils.doOnSuccess
import com.example.petfinder.domain.usesCase.InteractorPetAnimals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val interactorPetAnimals: InteractorPetAnimals
) : ViewModel() {
    private val _petAnimalsResponse: MutableState<AnimalsState> = mutableStateOf(AnimalsState())
    val petAnimalResponse: State<AnimalsState> = _petAnimalsResponse

    private val _petAnimalsResponseDetails: MutableState<AnimalsResponseDto.AnimalDto> =
        mutableStateOf(AnimalsResponseDto.AnimalDto())
    val petAnimalsResponseDetails: MutableState<AnimalsResponseDto.AnimalDto> =
        _petAnimalsResponseDetails


    fun setPetAnimals(data: AnimalsResponseDto.AnimalDto) {
        _petAnimalsResponseDetails.value = data
    }

    init {
        getPetAnimals()
    }

    private fun getPetAnimals() = viewModelScope.launch {
        interactorPetAnimals.getPetAllAnimals()
            .doOnSuccess { success ->
                _petAnimalsResponse.value = AnimalsState(data = success)
            }.doOnFailure { errorMsg ->
                _petAnimalsResponse.value = AnimalsState(error = errorMsg.toString())
            }.doOnLoading {
                _petAnimalsResponse.value = AnimalsState(isLoading = true)
            }.collect()
    }

}