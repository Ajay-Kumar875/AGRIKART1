package com.example.agrikart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        val kart = findViewById(R.id.kart) as ImageButton



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

        viewPager = findViewById(R.id.idViewPager)
        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.img_1
        imageList = imageList + R.drawable.img_2
        imageList = imageList + R.drawable.img_3
        imageList = imageList + R.drawable.img_4

        viewPagerAdapter = ViewPagerAdapter(this@HomePage, imageList)

        // on below line we are setting
        // adapter to our view pager.
        viewPager.adapter = viewPagerAdapter
        kart.setOnClickListener {
            val i1 = Intent(applicationContext,Kart::class.java)
            startActivity(i1)
        }
    }

    private fun setContent(s: String) {
    }


}