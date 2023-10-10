package com.example.petfinder.domain.repository

import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.data.utils.Result
import kotlinx.coroutines.flow.Flow

interface IPetAnimalsRepository {
    suspend fun getAllAnimals(): Flow<Result<AnimalsResponseDto>>
    suspend fun getSingleAnimal(): Flow<Result<AnimalsResponseDto.AnimalDto>>
}