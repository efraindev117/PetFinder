package com.example.petfinder.data.model.organizations


import com.google.gson.annotations.SerializedName

data class Hours(
    @SerializedName("friday")
    val friday: String?,
    @SerializedName("monday")
    val monday: String?,
    @SerializedName("saturday")
    val saturday: String?,
    @SerializedName("sunday")
    val sunday: String?,
    @SerializedName("thursday")
    val thursday: String?,
    @SerializedName("tuesday")
    val tuesday: String?,
    @SerializedName("wednesday")
    val wednesday: String?
)