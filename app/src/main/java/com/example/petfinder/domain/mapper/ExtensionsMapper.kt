package com.example.petfinder.domain.mapper
import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.domain.model.animals.Animal
import com.example.petfinder.domain.model.animals.Links
import com.example.petfinder.domain.model.animals.Organization
import com.example.petfinder.domain.model.animals.Self
import com.example.petfinder.domain.model.animals.Type

fun AnimalsResponseDto.AnimalDto.toDomain(): Animal{
    return Animal(
        age = this.age!!,
        coat = this.coat!!,
        description = this.description!!,
        gender = this.gender!!,
        id = this.id!!,
        name = this.name!!,
        organization_animal_id = this.organizationAnimalId!!,
        organization_id = this.organizationId!!,
        published_at = this.publishedAt!!,
        size = this.size!!,
        species = this.species!!,
        status = this.status!!,
        status_changed_at = this.statusChangedAt!!,
        tags = this.tags,
        type = this.type!!,
        url = this.url!!,
        _links = Links(
            organization = Organization(
                href = this.links.organization?.href ?: ""
            ),
            self = Self(
                href = this.links.self?.href ?: ""
            ),
            type = Type(
                href = this.links.type?.href ?: ""
            )
        )
    )
}