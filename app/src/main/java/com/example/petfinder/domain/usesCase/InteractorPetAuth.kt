package com.example.petfinder.domain.usesCase

import com.example.petfinder.domain.repository.IPetAuthTokenRepository
import javax.inject.Inject

class InteractorPetAuth @Inject constructor(
    private val petAuthTokenRepository: IPetAuthTokenRepository)