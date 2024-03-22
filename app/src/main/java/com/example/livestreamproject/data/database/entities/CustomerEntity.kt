package com.example.livestreamproject.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customer")
data class CustomerEntity(
    @PrimaryKey val id: String = "",
    val firstName: String? = null,
    val lastName: String? = null,
    val shortDescription: String? = null
)