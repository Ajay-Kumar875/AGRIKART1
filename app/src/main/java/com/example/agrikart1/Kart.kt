package com.example.agrikart1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Kart : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kart)

        val seed = findViewById<ImageView>(R.id.seed)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    setContent("Home")
                    startActivity(Intent(applicationContext,HomePage::class.java))
                    true
                }
                R.id.menu_kart -> {
                    startActivity(Intent(applicationContext,Kart::class.java))
                    setContent("Kart")
                    true
                }
                R.id.menu_care -> {
                    setContent("Crop Care")
                    startActivity(Intent(applicationContext,CropCare::class.java))
                    true
                }
                R.id.menu_messages -> {
                    setContent("Messsages")
                    startActivity(Intent(applicationContext,CropCare::class.java))
                    true
                }
                R.id.menu_setting -> {
                    setContent("Setting")
                    startActivity(Intent(applicationContext,Settings::class.java))
                    true
                }
                else -> false

            }
    }
        seed.setOnClickListener {
            val i1 = Intent(applicationContext,Seeds::class.java)
            startActivity(i1)
        }
}

    private fun setContent(s: String) {
    }


    }
