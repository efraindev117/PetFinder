package com.example.petfinder.domain.model.animals

data class AnimalsResponse(
    val animals: List<Animal>,
    val pagination: Pagination
)