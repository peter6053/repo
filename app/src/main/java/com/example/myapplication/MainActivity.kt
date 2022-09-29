package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gashomepage.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_start

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gashomepage)

        //  window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE
        btn_continue.setOnClickListener {

                val intent = Intent(this, selectcylinder::class.java)
                startActivity(intent)
                finish()
            }



    }

}