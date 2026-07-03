package com.example.muhandriansyah223280019.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIClient
{
    private const val BASE_URL = "http://10.37.84.68:8000/mobile_connection/"

    val instace: APIServices by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(APIServices::class.java)

    }
}