package com.example.petfinder.data.model.organizations


import com.google.gson.annotations.SerializedName

data class SocialMedia(
    @SerializedName("facebook")
    val facebook: String?,
    @SerializedName("instagram")
    val instagram: String?,
    @SerializedName("pinterest")
    val pinterest: Any?,
    @SerializedName("twitter")
    val twitter: Any?,
    @SerializedName("youtube")
    val youtube: Any?
)