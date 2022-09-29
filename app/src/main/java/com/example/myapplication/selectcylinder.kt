package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gashomepage.*
import kotlinx.android.synthetic.main.activity_gashomepage.btn_continue
import kotlinx.android.synthetic.main.activity_selectcylinder.*

class selectcylinder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectcylinder)
        btn_order.setOnClickListener {

            val intent = Intent(this, personadetailone::class.java)
            startActivity(intent)
            finish()
        }
    }

}