package com.example.petfinder.domain.repository

import com.example.petfinder.data.model.auth.AuthPetTokenDto
import com.example.petfinder.data.utils.Result
import kotlinx.coroutines.flow.Flow

interface IPetAuthTokenRepository {
    suspend fun getToken(): Flow<Result<AuthPetTokenDto>>
}