package com.example.petfinder.domain.repository

import com.example.petfinder.data.model.organizations.OrganizationsResponseDto
import com.example.petfinder.data.utils.Result
import kotlinx.coroutines.flow.Flow

interface IPetOrganizationRepository {
    suspend fun getAllOrganizations(): Flow<Result<OrganizationsResponseDto>>
    suspend fun getSingleOrganizations(): Flow<Result<OrganizationsResponseDto.OrganizationDto>>
}