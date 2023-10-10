package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Contact(
    @SerializedName("address")
    val address: Address?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("phone")
    val phone: String?
)