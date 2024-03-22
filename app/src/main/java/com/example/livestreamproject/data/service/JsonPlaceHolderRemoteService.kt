package com.example.livestreamproject.data.service

import com.example.appbase.base.network.BaseRemoteService
import com.example.baseprojectxml.base.network.NetworkResult
import com.example.livestreamproject.data.api.JsonPlaceHolderApi
import com.example.livestreamproject.data.modelJson.PostJson
import javax.inject.Inject

class JsonPlaceHolderRemoteService @Inject constructor(
    private val jsonPlaceHolderApi: JsonPlaceHolderApi
) : BaseRemoteService() {

    suspend fun getAllPosts(): NetworkResult<List<PostJson>> {
        return callApi {
            jsonPlaceHolderApi.getAllPosts()
        }
    }

}
