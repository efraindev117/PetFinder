package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("href")
    val href: String?
)