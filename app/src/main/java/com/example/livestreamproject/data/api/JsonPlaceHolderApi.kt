package com.example.livestreamproject.data.api

import com.example.livestreamproject.data.modelJson.PostJson
import retrofit2.Response
import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET("/posts")
    suspend fun getAllPosts(): Response<List<PostJson>>

}