package com.example.petfinder.data.model.types


import com.google.gson.annotations.SerializedName

data class Self(
    @SerializedName("href")
    val href: String?
)