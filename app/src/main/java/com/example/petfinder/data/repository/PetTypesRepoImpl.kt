package com.example.petfinder.data.repository

import com.example.petfinder.data.api.ApiService
import com.example.petfinder.data.model.types.TypeDto
import com.example.petfinder.data.model.types.TypesResponseDto
import com.example.petfinder.data.utils.Result
import com.example.petfinder.domain.repository.IPetTypesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PetTypesRepoImpl @Inject constructor(
    apiService: ApiService
) : IPetTypesRepository {
    override suspend fun getPetTypesAnimals(): Flow<Result<TypesResponseDto>> {
        TODO("Not yet implemented")
    }

    override suspend fun getPetTypesSingleAnimal(): Flow<Result<TypeDto>> {
        TODO("Not yet implemented")
    }
}