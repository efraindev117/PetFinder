package com.example.petfinder.data.utils

interface Mapper<F, T> {
    fun mapFrom(from: F): T
}