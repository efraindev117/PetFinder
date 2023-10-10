package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("address1")
    val address1: String?,
    @SerializedName("address2")
    val address2: Any?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("postcode")
    val postcode: String?,
    @SerializedName("state")
    val state: String?
)