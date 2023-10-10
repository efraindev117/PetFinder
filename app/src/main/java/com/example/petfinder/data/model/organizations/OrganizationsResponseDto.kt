package com.example.petfinder.data.model.organizations


import com.google.gson.annotations.SerializedName

data class OrganizationsResponseDto(
    @SerializedName("organizations")
    val organizations: List<OrganizationDto>?,
    @SerializedName("pagination")
    val pagination: Pagination?
){
    data class OrganizationDto(
        @SerializedName("address")
        val address: Address?,
        @SerializedName("adoption")
        val adoption: Adoption?,
        @SerializedName("distance")
        val distance: Any?,
        @SerializedName("email")
        val email: String?,
        @SerializedName("hours")
        val hours: Hours?,
        @SerializedName("id")
        val id: String?,
        @SerializedName("_links")
        val links: Links?,
        @SerializedName("mission_statement")
        val missionStatement: String?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("phone")
        val phone: String?,
        @SerializedName("photos")
        val photos: List<Photo?>?,
        @SerializedName("social_media")
        val socialMedia: SocialMedia?,
        @SerializedName("url")
        val url: String?,
        @SerializedName("website")
        val website: String?
    )
}