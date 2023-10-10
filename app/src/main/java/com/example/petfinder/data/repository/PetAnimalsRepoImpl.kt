package com.example.petfinder.data.repository

import com.example.petfinder.data.api.ApiService
import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.data.utils.BaseRepository
import com.example.petfinder.data.utils.Result
import com.example.petfinder.domain.repository.IPetAnimalsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PetAnimalsRepoImpl @Inject constructor(
    private val apiService: ApiService
) : BaseRepository(), IPetAnimalsRepository {
    override suspend fun getAllAnimals(): Flow<Result<AnimalsResponseDto>> = safeApiCall {

    }

    override suspend fun getSingleAnimal(): Flow<Result<AnimalsResponseDto.AnimalDto>> {
        TODO("Not yet implemented")
    }
}