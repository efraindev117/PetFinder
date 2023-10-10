package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("full")
    val full: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("small")
    val small: String?
)