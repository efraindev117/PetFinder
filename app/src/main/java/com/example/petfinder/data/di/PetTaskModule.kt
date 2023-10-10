package com.example.petfinder.data.di

import com.example.petfinder.data.repository.PetAnimalsRepoImpl
import com.example.petfinder.data.repository.PetAuthTokenRepoImpl
import com.example.petfinder.data.repository.PetOrganizationRepoImpl
import com.example.petfinder.data.repository.PetTypesRepoImpl
import com.example.petfinder.domain.repository.IPetAnimalsRepository
import com.example.petfinder.domain.repository.IPetAuthTokenRepository
import com.example.petfinder.domain.repository.IPetOrganizationRepository
import com.example.petfinder.domain.repository.IPetTypesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class PetTaskModule {
    @Binds
    abstract fun providePetAnimalRepository(
        petAnimalsRepoImpl: PetAnimalsRepoImpl
    ): IPetAnimalsRepository

    @Binds
    abstract fun providePetOrganizationRepository(
        petOrganizationRepoImpl: PetOrganizationRepoImpl
    ): IPetOrganizationRepository

    @Binds
    abstract fun providePetTypeRepository(
        petTypesRepoImpl: PetTypesRepoImpl
    ): IPetTypesRepository

    @Binds
    abstract fun providePetAuthRepository(
        petAuthTokenRepoImpl: PetAuthTokenRepoImpl
    ): IPetAuthTokenRepository
}