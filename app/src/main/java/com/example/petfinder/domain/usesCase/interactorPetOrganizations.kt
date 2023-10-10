package com.example.petfinder.domain.usesCase

import com.example.petfinder.data.utils.Result
import com.example.petfinder.data.utils.map
import com.example.petfinder.domain.mapper.PetOrganizationsMapper
import com.example.petfinder.domain.model.model_ui.OrganizationsUiModel
import com.example.petfinder.domain.repository.IPetOrganizationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class interactorPetOrganizations @Inject constructor(
    private val petOrganizationRepository: IPetOrganizationRepository,
    private val petOrganizationsMapper: PetOrganizationsMapper
) {
    suspend fun getAllPetOrganizations(): Flow<Result<List<OrganizationsUiModel>?>> {
        return petOrganizationRepository.getAllOrganizations().map { result ->
            result.map {
                petOrganizationsMapper.mapFrom(it)
            }
        }
    }
}