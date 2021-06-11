package com.example.quizapplication.model

object UsernameTest {


    /**
     * the input is not valid if...
     * ...the username is empty
     * ...the username contains less than 2 characters
     */
    fun validateRegistrationInput(
        username: String
    ):Boolean {
        if(username.isEmpty()){
            return false
        }
        if (username.count {it.isLetterOrDigit()} < 2){
            return false
        }
        return true
    }
}