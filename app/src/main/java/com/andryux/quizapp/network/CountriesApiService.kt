package com.andryux.quizapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
//Retrofit compiler call
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

class CountriesApiService {

    interface CountriesApiService{
        @GET("flags")
        suspend fun getFlags(): List<CountryFlag>
    }

    //Initializer Retrofit service (Singleton Object)
    object CountriesApi{
        val retrofitService: CountriesApiService by lazy {
            retrofit.create(CountriesApiService::class.java)
        }
    }
}