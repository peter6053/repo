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
        tv_progress.text = "$currentposition" +"/" +progress_dilaog.max
        image.setImageResource(question!!.image)
        tv_option_one.text=question.optiononr
        tv_option_two.text=question.optiontwo
        tv_option_three.text=question.optionthree
        tv_option_four.text=question.optiofour




    }
}