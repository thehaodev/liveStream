package com.example.livestreamproject.data.service

import com.example.livestreamproject.data.database.daos.CustomerDao
import com.example.livestreamproject.data.database.entities.CustomerEntity
import javax.inject.Inject

class CustomerLocalService @Inject constructor(private val customerDao: CustomerDao) {

    suspend fun createCustomer(customerEntity: CustomerEntity): Long {
        return customerDao.createCustomer(customerEntity)
    }

    suspend fun getAllCustomer(): List<CustomerEntity>{
        return customerDao.getAll()
    }

}
