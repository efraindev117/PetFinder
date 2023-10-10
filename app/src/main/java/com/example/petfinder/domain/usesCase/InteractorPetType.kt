package com.example.petfinder.domain.usesCase

import com.example.petfinder.data.utils.Result
import com.example.petfinder.data.utils.map
import com.example.petfinder.domain.mapper.PetTypeMapper
import com.example.petfinder.domain.model.model_ui.TypeUiModel
import com.example.petfinder.domain.repository.IPetTypesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class InteractorPetType @Inject constructor(
    private val petTypesRepository: IPetTypesRepository,
    private val petTypeMapper: PetTypeMapper
) {
    suspend fun getPetTypes(): Flow<Result<List<TypeUiModel>?>> {
        return petTypesRepository.getPetTypesAnimals().map { result ->
            result.map {
                petTypeMapper.mapFrom(it)
            }
        }
    }
}