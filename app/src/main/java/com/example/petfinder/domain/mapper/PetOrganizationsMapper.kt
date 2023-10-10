package com.example.petfinder.domain.mapper

import com.example.petfinder.data.model.organizations.OrganizationsResponseDto
import com.example.petfinder.data.utils.Mapper
import com.example.petfinder.domain.model.model_ui.OrganizationsUiModel
import javax.inject.Inject

class PetOrganizationsMapper @Inject constructor() :
    Mapper<OrganizationsResponseDto, List<OrganizationsUiModel>?> {

    override fun mapFrom(from: OrganizationsResponseDto): List<OrganizationsUiModel>? {
        return from?.organizations?.map {
            OrganizationsUiModel(
                OrganizationsResponseDto.OrganizationDto(
                    address = it.address,
                    adoption = it.adoption,
                    distance = it.distance,
                    email = it.email,
                    hours = it.hours,
                    id = it.id,
                    links = it.links,
                    missionStatement = it.missionStatement,
                    name = it.name,
                    phone = it.phone,
                    photos = it.photos,
                    socialMedia = it.socialMedia,
                    url = it.url,
                    website = it.website
                )
            )
        }
    }
}