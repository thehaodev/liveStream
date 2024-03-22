package com.example.appbase.base.network

import com.example.baseprojectxml.base.network.BaseNetworkException
import com.example.baseprojectxml.base.network.BaseService
import com.example.baseprojectxml.base.network.NetworkResult
import retrofit2.Response

open class BaseRemoteService : BaseService() {

    protected suspend fun <T : Any> callApi(call: suspend () -> Response<T>): NetworkResult<T> {
        val response: Response<T>
        try {
            response = call.invoke()
        } catch (t: Throwable) {
            return NetworkResult.Error(parseNetworkErrorException(t))
        }

        return if (response.isSuccessful) {
            if (response.body() == null) {
                NetworkResult.Error(
                    BaseNetworkException(
                        responseMessage = "Response without body",
                        responseCode = 200
                    )
                )
            } else {
                NetworkResult.Success(response.body()!!)
            }
        } else {
            val errorBody = response.errorBody()?.string() ?: ""
            NetworkResult.Error(parseError(response.message(), response.code(), errorBody))
        }
    }

    fun reverseArray(a: Array<Int>): Array<Int> {
        val length = a.size
        val arrayResult = Array<Int>(3) { 0 }

        for (i in length - 1 downTo 0) {
            arrayResult[length-i] = a[i]
        }

        return arrayResult
    }

}