package com.example.livestreamproject.data.models

import com.example.livestreamproject.data.database.entities.CustomerEntity

class Customer(
    val id: String = "",
    var firstName: String? = null,
    var lastName: String? = null,
    var shortDescription: String? = null,
) {
    fun toCustomerEntity(): CustomerEntity {
        val customerId = if (id == "") "" else id
        return CustomerEntity(
            id = customerId,
            firstName = firstName ?: "",
            lastName = lastName ?: "",
            shortDescription = shortDescription ?: ""
        )
    }
//
//    fun isValidateFirstName(): Boolean {
//
//    }
//
//    fun isValidateLastName(): Boolean {
//
//    }
//
//    fun isValidateShortDescription(): Boolean {
//
//    }
//
    fun fullName(): String {
        return "$firstName $lastName"
    }

}

fun CustomerEntity.toCustomer(): Customer {
    return Customer(
        id = id,
        firstName = firstName,
        lastName = lastName,
        shortDescription = shortDescription
    )
}