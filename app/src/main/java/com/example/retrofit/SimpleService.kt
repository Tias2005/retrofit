package com.example.retrofit

import com.example.retrofit.Book
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SimpleService {
    //https://potterapi-fedeperin.vercel.app/en/books

    @GET("{language}/books")
    suspend fun listBooks(@Path("language") language: String = "en")
            :List<Book>

    @GET("{language}/characters")
    suspend fun getCharacters(@Path("language") language: String = "en")
            :List<Character>

//    @POST("Feedback")
//    suspend fun feedback(@Body feedback: Feedback)
}