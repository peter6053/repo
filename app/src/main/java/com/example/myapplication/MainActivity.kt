package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE
        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,"please enter your name", Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this, quizactivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }

}