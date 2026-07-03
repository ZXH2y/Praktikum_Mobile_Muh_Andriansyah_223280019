package com.example.muhandriansyah223280019.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIClient
{
    private const val BASE_URL = "http://127.0.0.1/api-ti23/"

    val instace: APIServices by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(APIServices::class.java)

    }
}