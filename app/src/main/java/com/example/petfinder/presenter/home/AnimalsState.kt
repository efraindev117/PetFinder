package com.example.petfinder.presenter.home

import com.example.petfinder.domain.model.model_ui.AnimalUIModel

data class AnimalsState(
    val data: List<AnimalUIModel>? = emptyList(),
    val error: String = "",
    val isLoading: Boolean = false
)