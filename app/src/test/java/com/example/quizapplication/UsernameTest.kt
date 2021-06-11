package com.example.quizapplication

import com.example.quizapplication.model.UsernameTest
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class UsernameTest{

    @Test
    fun `empty username returns false`(){
        val result = UsernameTest.validateRegistrationInput(
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username more than 2 returns false`(){
        val result = UsernameTest.validateRegistrationInput(
            "ab"
        )
        assertThat(result).isFalse()
    }
}