package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class Colors(
    @SerializedName("primary")
    val primary: String?,
    @SerializedName("secondary")
    val secondary: String?,
    @SerializedName("tertiary")
    val tertiary: Any?
)