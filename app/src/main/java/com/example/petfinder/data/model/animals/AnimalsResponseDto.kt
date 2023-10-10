package com.example.petfinder.data.model.animals


import com.google.gson.annotations.SerializedName

data class AnimalsResponseDto(
    @SerializedName("animals")
    val animals: List<AnimalDto>?,
    @SerializedName("pagination")
    val pagination: Pagination?
) {
    data class AnimalDto(
        @SerializedName("age")
        val age: String? = "",
        @SerializedName("attributes")
        val attributes: Attributes? = null,
        @SerializedName("breeds")
        val breeds: Breeds? = null,
        @SerializedName("coat")
        val coat: String? = "",
        @SerializedName("colors")
        val colors: Colors? = null,
        @SerializedName("contact")
        val contact: Contact? = null,
        @SerializedName("description")
        val description: String? = "",
        @SerializedName("distance")
        val distance: Any? = null,
        @SerializedName("environment")
        val environment: Environment? = null,
        @SerializedName("gender")
        val gender: String? = "",
        @SerializedName("id")
        val id: Int? = 0,
        @SerializedName("_links")
        val links: Links? = null,
        @SerializedName("name")
        val name: String? = "",
        @SerializedName("organization_animal_id")
        val organizationAnimalId: String? = "",
        @SerializedName("organization_id")
        val organizationId: String? = "",
        @SerializedName("photos")
        val photos: List<Photo?>? = emptyList(),
        @SerializedName("primary_photo_cropped")
        val primaryPhotoCropped: PrimaryPhotoCropped? = null,
        @SerializedName("published_at")
        val publishedAt: String? = "",
        @SerializedName("size")
        val size: String? = "",
        @SerializedName("species")
        val species: String? = "",
        @SerializedName("status")
        val status: String? = "",
        @SerializedName("status_changed_at")
        val statusChangedAt: String? = "",
        @SerializedName("tags")
        val tags: List<String>? = emptyList(),
        @SerializedName("type")
        val type: String? = "",
        @SerializedName("url")
        val url: String? = "",
        @SerializedName("videos")
        val videos: List<Any?>? = emptyList()
    )
}