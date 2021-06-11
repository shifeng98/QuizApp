package com.example.quizapplication.model

import com.example.quizapplication.R

class QuestionRepo {

    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_question"
    val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {


        val list = arrayListOf<Question>()

        list.add(
            Question(
                1, "What computer component is this?",
                R.drawable.gpu, "Graphic Processing Unit",
                "Processor",
                "Mouse",
                "Solid State Drive", 1
            )
        )

        list.add(
            Question(
                2, "What computer component is this?",
                R.drawable.cpu, "Mouse",
                "RAM",
                "Central Processing Unit",
                "Hard Disk Drive", 3
            )

        )

        list.add(
            Question(
                3, "What computer component is this?",
                R.drawable.hdd, "Keyboard",
                "Mouse",
                "Solid State Drive",
                "Hard Disk Drive", 4
            )
        )

        list.add(
            Question(
                4, "What computer component is this?",
                R.drawable.keyboard, "Graphic Processing Unit",
                "Central Processing Unit",
                "Monitor",
                "Speaker", 2
            )
        )

        list.add(
            Question(
                5, "What computer component is this?",
                R.drawable.monitor, "Monitor",
                "Keyboard",
                "Mouse",
                "Central Processing Unit", 1
            )
        )

        list.add(
            Question(
                6, "What computer component is this?",
                R.drawable.motherboard, "Mouse",
                "Motherboard",
                "Solid State Drive",
                "Monitor", 2
            )
        )

        list.add(
            Question(
                7, "What computer component is this?",
                R.drawable.mouse, "RAM",
                "Central Processing Unit",
                "Mouse",
                "Monitor", 3
            )
        )


        list.add(
            Question(
                8, "What computer component is this?",
                R.drawable.ram,
                "Monitor",
                "RAM",
                "Motherboard",
                "Keyboard",2
            )

        )

        list.add(
            Question(
                9, "What computer component is this?",
                R.drawable.speaker, "Mouse",
                "Graphic Processing Unit",
                "RAM",
                "Speaker", 4
            )
        )

        list.add(
            Question(
                10, "What computer component is this?",
                R.drawable.ssd, "Solid State Drive",
                "RAM",
                "Mouse",
                "Central Processing Unit", 1
            )
        )


        return list
    }


}