package com.example.livestreamproject.utils

object RegistrationUtil {

    private val existingUser = listOf("Peter", "Carl")

    /**
     * Condition:
     * ... username/password must not empty
     * ... username is already taken
     * ... the confirmed password is not the same as the real password
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return true
    }

}
