package com.example.petfinder.data.api

import com.example.petfinder.data.model.animals.AnimalsResponseDto
import com.example.petfinder.data.model.auth.AuthPetTokenDto
import com.example.petfinder.data.model.organizations.OrganizationsResponseDto
import com.example.petfinder.data.model.types.TypesResponseDto
import com.example.petfinder.data.utils.Constants.CREATE_TOKEN
import com.example.petfinder.data.utils.Constants.GET_ALL_PETS
import com.example.petfinder.data.utils.Constants.GET_BY_ID_PETS
import com.example.petfinder.data.utils.Constants.GET_ORGAIZATIONS
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST(CREATE_TOKEN)
    suspend fun getTokenOauth2(
        @Field("grant_type") grantType: String,
        @Field("client_id") clientId: String,
        @Field("client_secret") clientSecret: String
    ): Response<AuthPetTokenDto>

    @GET(GET_ALL_PETS)
    suspend fun getAllAnimals(): Response<AnimalsResponseDto>

    @GET(GET_BY_ID_PETS)
    suspend fun getAnimalbyId(): Response<TypesResponseDto>

    @GET(GET_ORGAIZATIONS)
    suspend fun getPetOrganizations(): Response<OrganizationsResponseDto>
}