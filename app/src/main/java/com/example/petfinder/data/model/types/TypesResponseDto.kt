package com.example.petfinder.data.model.types


import com.google.gson.annotations.SerializedName

data class TypesResponseDto(
    @SerializedName("types")
    val types: List<TypeDto?>?
){
    data class TypeDto(
        @SerializedName("coats")
        val coats: List<String?>?,
        @SerializedName("colors")
        val colors: List<String?>?,
        @SerializedName("genders")
        val genders: List<String?>?,
        @SerializedName("_links")
        val links: Links?,
        @SerializedName("name")
        val name: String?
    )
}