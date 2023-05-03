package com.example.agrikart1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class Seeds : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seeds)

        val flwer = findViewById<TextView>(R.id.Flower)
        val vegtble = findViewById<TextView>(R.id.Vegetable)

        flwer.setOnClickListener {
            val i1 = Intent(applicationContext,FlowerSeed::class.java)
            startActivity(i1)
        }

        vegtble.setOnClickListener {
            val i1 = Intent(applicationContext,VegetableSeed::class.java)
            startActivity(i1)
        }


    }
}