package com.example.livestreamproject.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.livestreamproject.data.database.entities.CustomerEntity

@Dao
interface CustomerDao {

    @Query("select * from customer")
    fun getAll(): List<CustomerEntity>

    @Insert
    suspend fun createCustomer(customerEntity: CustomerEntity): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateCustomer(customerEntity: CustomerEntity)

    @Delete
    suspend fun deleteCustomer(customerEntity: CustomerEntity)


}