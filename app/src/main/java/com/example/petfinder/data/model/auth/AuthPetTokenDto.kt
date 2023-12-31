package com.example.petfinder.data.model.auth


import com.google.gson.annotations.SerializedName

data class AuthPetTokenDto(
    @SerializedName("access_token")
    val accessToken: String?,
    @SerializedName("expires_in")
    val expiresIn: Int?,
    @SerializedName("token_type")
    val tokenType: String?
)