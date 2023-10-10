package com.example.petfinder.data.model.organizations


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("animals")
    val animals: Animals?,
    @SerializedName("self")
    val self: Self?
)