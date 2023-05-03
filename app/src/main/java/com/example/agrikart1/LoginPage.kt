package com.example.agrikart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        val lgnbtn = findViewById<Button>(R.id.Login)
        lateinit var googleicn : ImageButton
        googleicn = findViewById(R.id.googleicon)
        val signup = findViewById<TextView>(R.id.textView4)

        lgnbtn.setOnClickListener {
            val  i = Intent(applicationContext,HomePage::class.java)
            startActivity(i)
        }
        signup.setOnClickListener {
            val i0 = Intent(applicationContext,SIgnUpPage::class.java)
            startActivity(i0)
        }
        googleicn.setOnClickListener {
            val i1 = Intent(applicationContext,SIgnUpPage::class.java)
            startActivity(i1)
        }
    }
}