package com.example.petfinder.domain.model.animals

data class Breeds(
    val mixed: Boolean,
    val primary: String,
    val secondary: String,
    val unknown: Boolean
)