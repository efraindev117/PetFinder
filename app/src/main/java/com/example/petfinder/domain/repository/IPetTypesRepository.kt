package com.example.petfinder.domain.repository

import com.example.petfinder.data.model.types.TypeDto
import com.example.petfinder.data.model.types.TypesResponseDto
import com.example.petfinder.data.utils.Result
import kotlinx.coroutines.flow.Flow

interface IPetTypesRepository {
    suspend fun getPetTypesAnimals(): Flow<Result<TypesResponseDto>>
    suspend fun getPetTypesSingleAnimal(): Flow<Result<TypeDto>>
}