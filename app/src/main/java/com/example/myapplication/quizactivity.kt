package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_scroll_view.*

class quizactivity : AppCompatActivity(), View.OnClickListener {
    private var mcurrentpostion: Int = 1
    private var mquestionlist: ArrayList<Question>? = null
    private var mselectepostion: Int = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_scroll_view
        )
        mquestionlist = Constants.getQuestions()
        setquestions()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


    }

    private fun setquestions() {
        val question: Question? = mquestionlist!!.get(mcurrentpostion - 1)

        defaultOptionsView()
        progress_dilaog.progress = mcurrentpostion
        tv_progress.text = "$mcurrentpostion" + "/" + progress_dilaog.max
        image.setImageResource(question!!.image)
        tv_option_one.text = question.optiononr
        tv_option_two.text = question.optiontwo
        tv_option_three.text = question.optionthree
        tv_option_four.text = question.optiofour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor((Color.parseColor("#7A8089")))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.selectionoptionbodar
            )
        }

    }

    override fun onClick(V: View?) {
        when (V?.id) {
            R.id.tv_option_one -> {
                selectedoptionvie(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                selectedoptionvie(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                selectedoptionvie(tv_option_two, 3)
            }
            R.id.tv_option_four -> {
                selectedoptionvie(tv_option_two, 4)
            }
            R.id.btn_submit -> {
                if (mselectepostion == 0) {
                    mcurrentpostion++
                }
                when {mcurrentpostion <= mquestionlist!!.size ->
                    setquestions()
                    else ->
                        Toast.makeText(this, "you have completed the quiz", Toast.LENGTH_LONG).show()

                }




            }
        }

    }

    private fun answerview(answer: Int, drawbleview: Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(this, drawbleview)
            }

        }
        when (answer) {
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(this, drawbleview)
            }

        }
        when (answer) {
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(this, drawbleview)
            }

        }
        when (answer) {
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(this, drawbleview)
            }

        }


    }


    private fun selectedoptionvie(tv: TextView, selectionoptionn: Int) {
        defaultOptionsView()
        mselectepostion = selectionoptionn
        tv.setTextColor((Color.parseColor("#363a43")))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selectionoptionbodar2
        )

    }
}