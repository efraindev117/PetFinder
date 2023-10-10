package com.example.petfinder.domain.mapper

import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.data.utils.Mapper
import com.example.petfinder.domain.model.model_ui.AnimalUIModel
import javax.inject.Inject

class PetAnimalMapper @Inject constructor() : Mapper<AnimalsResponseDto?, List<AnimalUIModel>?> {
    override fun mapFrom(from: AnimalsResponseDto?): List<AnimalUIModel>? {
        return from?.animals?.map {
            AnimalUIModel(
                AnimalsResponseDto.AnimalDto(
                    age = it.age,
                    attributes = it.attributes,
                    breeds = it.breeds,
                    coat = it.coat,
                    colors = it.colors,
                    contact = it.contact,
                    description = it.description,
                    distance = it.distance,
                    environment = it.environment,
                    gender = it.gender,
                    id = it.id,
                    links = it.links,
                    name = it.name,
                    organizationAnimalId = it.organizationAnimalId,
                    organizationId = it.organizationId,
                    photos = it.photos,
                    primaryPhotoCropped = it.primaryPhotoCropped,
                    publishedAt = it.publishedAt,
                    size = it.size,
                    species = it.species,
                    status = it.status,
                    statusChangedAt = it.statusChangedAt,
                    tags = it.tags,
                    type = it.type,
                    url = it.url,
                    videos = it.videos
                )
            )
        }
    }
}