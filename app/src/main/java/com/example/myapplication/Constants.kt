package com.example.myapplication

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionlist = ArrayList<Question>()
        val que1 = Question(
            1,
            "what country",
            R.drawable.kenyanflag,
            "kenya",
            "ug",
            "tanzania",
            "burundi",
            "1"
        )
        questionlist.add(que1)
        return questionlist


    }

}