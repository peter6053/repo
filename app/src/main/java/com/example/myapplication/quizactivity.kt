package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scroll_view.*

class quizactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_quizactivity
        )
        val questionlist = Constants.getQuestions()
        Log.i("sixe", "${questionlist.size}")
        val currentposition = 1
        val question: Question? = questionlist[currentposition - 1]

        progress_dilaog.progress = currentposition
        tv_progress.text = question!!.question


    }
}