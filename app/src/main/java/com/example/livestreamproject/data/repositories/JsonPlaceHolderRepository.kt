package com.example.livestreamproject.data.repositories

import com.example.baseprojectxml.base.network.NetworkResult
import com.example.livestreamproject.di.IoDispatcher
import com.example.livestreamproject.data.service.JsonPlaceHolderRemoteService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class JsonPlaceHolderRepository @Inject constructor(
    private val jsonPlaceHolderRemoteService: JsonPlaceHolderRemoteService,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {

    suspend fun getAllPosts() = withContext(dispatcher) {
        when (val result = jsonPlaceHolderRemoteService.getAllPosts()) {
            is NetworkResult.Success -> {
                result.data.map { it.toPost() }
            }
            is NetworkResult.Error -> {
                throw result.exception
            }
        }
    }

}



