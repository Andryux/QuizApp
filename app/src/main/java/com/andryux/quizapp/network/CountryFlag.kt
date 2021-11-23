package com.andryux.quizapp.network

import com.squareup.moshi.Json

data class CountryFlag (
    val id: String,
    @Json(name = "img_src")
    val imgSrcUrl: String
)