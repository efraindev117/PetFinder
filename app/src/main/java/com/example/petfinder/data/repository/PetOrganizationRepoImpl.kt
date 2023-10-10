package com.example.petfinder.data.repository

import com.example.petfinder.data.api.ApiService
import com.example.petfinder.data.model.organizations.OrganizationDto
import com.example.petfinder.data.model.organizations.OrganizationsResponseDto
import com.example.petfinder.data.utils.Result
import com.example.petfinder.domain.repository.IPetOrganizationRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PetOrganizationRepoImpl @Inject constructor(
    apiService: ApiService
) : IPetOrganizationRepository {

    override suspend fun getAllOrganizations(): Flow<Result<OrganizationsResponseDto>> {
        TODO("Not yet implemented")
    }

    override suspend fun getSingleOrganizations(): Flow<Result<OrganizationDto>> {
        TODO("Not yet implemented")
    }
}