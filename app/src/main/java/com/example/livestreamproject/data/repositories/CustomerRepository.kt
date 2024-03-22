package com.example.livestreamproject.data.repositories

import com.example.livestreamproject.data.database.entities.CustomerEntity
import com.example.livestreamproject.data.service.CustomerLocalService
import com.example.livestreamproject.data.service.CustomerRemoteService
import com.example.livestreamproject.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class CustomerRepository constructor(
    private val customerRemoteService: CustomerRemoteService,
    private val customerLocalService: CustomerLocalService,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {

    suspend fun createCustomer(customerEntity: CustomerEntity) = withContext(dispatcher) {
        customerLocalService.createCustomer(customerEntity)
    }

    suspend fun getAll() = withContext(dispatcher) {
        customerLocalService.getAllCustomer()
    }

}
