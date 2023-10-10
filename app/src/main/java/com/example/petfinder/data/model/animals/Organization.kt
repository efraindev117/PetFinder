package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Organization(
    @SerializedName("href")
    val href: String?
)