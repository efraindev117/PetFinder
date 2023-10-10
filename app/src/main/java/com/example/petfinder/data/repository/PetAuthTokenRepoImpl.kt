package com.example.petfinder.data.repository

import com.example.petfinder.data.api.ApiService
import com.example.petfinder.data.model.auth.AuthPetTokenDto
import com.example.petfinder.data.utils.Result
import com.example.petfinder.domain.repository.IPetAuthTokenRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PetAuthTokenRepoImpl @Inject constructor(
    private val apiService: ApiService): IPetAuthTokenRepository {

    override suspend fun getToken(): Flow<Result<AuthPetTokenDto>> {
        TODO("Not yet implemented")
    }
}