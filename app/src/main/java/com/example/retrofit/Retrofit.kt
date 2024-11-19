package com.example.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL= "https://potterapi-fedeperin.vercel.app"

    fun getInstance():Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    val retrofitService:SimpleService by lazy{
        getInstance().create(SimpleService::class.java)
    }
}