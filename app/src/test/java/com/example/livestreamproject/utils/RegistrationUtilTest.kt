package com.example.livestreamproject.utils


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    /**
     * Should write this first
     *
     */

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

}
