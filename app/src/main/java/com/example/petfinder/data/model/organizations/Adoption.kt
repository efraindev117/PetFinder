package com.example.petfinder.data.model.organizations


import com.google.gson.annotations.SerializedName

data class Adoption(
    @SerializedName("policy")
    val policy: String?,
    @SerializedName("url")
    val url: String?
)