package com.example.quizapplication.model


import com.example.quizapplication.R
import com.example.quizapplication.model.Question

class QuestionRepo {

    fun getQuestions(): ArrayList<Question> {


        val list = arrayListOf<Question>()

        list.add(
            Question(
                1, "What country does this flag belong to?",
                R.drawable.aus_flag, "Australia",
                "Austria",
                "Argentina",
                "Armenia", 1
            )
        )

        list.add(
            Question(
                2, "What country does this flag belong to?",
                R.drawable.brunei_flag, "Korea",
                "Australia",
                "Brunei",
                "China", 3
            )

        )

        list.add(
            Question(
                3, "What country does this flag belong to?",
                R.drawable.china_flag, "Korea",
                "Japan",
                "Brunei",
                "China", 4
            )
        )

        list.add(
            Question(
                4, "What country does this flag belong to?",
                R.drawable.jpn_flag, "New Zealand",
                "Japan",
                "Russia",
                "India", 2
            )
        )

        list.add(
            Question(
                5, "What country does this flag belong to?",
                R.drawable.korea_flag, "Korea",
                "Spain",
                "Brunei",
                "France", 1
            )
        )

        list.add(
            Question(
                6, "What country does this flag belong to?",
                R.drawable.my_flag, "Spain",
                "Malaysia",
                "United Kingdom",
                "United States", 2
            )
        )

        list.add(
            Question(
                7, "What country does this flag belong to?",
                R.drawable.nz_flag, "United Kingdom",
                "Australia",
                "New Zealand",
                "Japan", 3
            )
        )


        list.add(
            Question(
                8, "What country does this flag belong to?",
                R.drawable.sg_flag,
                "Thailand",
                "Singapore",
                "Malaysia",
                "Korea",2
            )

        )

        list.add(
            Question(
                9, "What country does this flag belong to?",
                R.drawable.uk_flag, "Spain",
                "Australia",
                "Malaysia",
                "United Kingdom", 3
            )
        )

        list.add(
            Question(
                10, "What country does this flag belong to?",
                R.drawable.us_flag, "United States",
                "France",
                "Finland",
                "India", 1
            )
        )


        return list
    }


}