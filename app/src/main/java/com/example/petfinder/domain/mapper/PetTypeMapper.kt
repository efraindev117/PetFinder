package com.example.petfinder.domain.mapper

import com.example.petfinder.data.model.types.TypesResponseDto
import com.example.petfinder.data.utils.Mapper
import com.example.petfinder.domain.model.model_ui.TypeUiModel
import javax.inject.Inject

class PetTypeMapper @Inject constructor() : Mapper<TypesResponseDto?, List<TypeUiModel>?> {
    override fun mapFrom(from: TypesResponseDto?): List<TypeUiModel>? {
        return from?.types?.map {
            TypeUiModel(
                TypesResponseDto.TypeDto(
                    coats = it?.coats,
                    colors = it?.colors,
                    genders = it?.genders,
                    links = it?.links,
                    name = it?.name
                )
            )
        }
    }
}