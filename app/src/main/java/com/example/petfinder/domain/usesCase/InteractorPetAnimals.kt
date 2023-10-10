package com.example.petfinder.domain.usesCase

import com.example.petfinder.data.utils.Result
import com.example.petfinder.data.utils.map
import com.example.petfinder.domain.mapper.PetAnimalMapper
import com.example.petfinder.domain.model.model_ui.AnimalUIModel
import com.example.petfinder.domain.repository.IPetAnimalsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class InteractorPetAnimals @Inject constructor(
    private val animalsRepository: IPetAnimalsRepository,
    private val petAnimalMapper: PetAnimalMapper
) {

    suspend fun getPetAllAnimals(): Flow<Result<List<AnimalUIModel>?>> {
        return animalsRepository.getAllAnimals().map { result ->
            result.map {
                petAnimalMapper.mapFrom(it)
            }
        }
    }
}