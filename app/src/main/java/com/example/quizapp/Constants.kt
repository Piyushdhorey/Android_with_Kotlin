package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            id = 1, "What country's flag is this?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            id = 2, "What country's flag is this?",
            R.drawable.ic_flag_of_belgium,
            "Britain", "Bangladesh", "Belgium", "Austria",
            3
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            id = 3, "What country's flag is this?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "India", "Fiji", "Kuwait",
            1
        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            id = 4, "What country's flag is this?",
            R.drawable.ic_flag_of_denmark,
            "New Zealand", "Denmark", "India", "Austria",
            2
        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            id = 5, "What country's flag is this?",
            R.drawable.ic_flag_of_india,
            "Iran", "India", "Indonesia", "Italy",
            2
        )
        questionList.add(que5)


        return questionList
    }
}