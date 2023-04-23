package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guineapig = findViewById<ImageButton>(R.id.guineapigIB)
        val dog = findViewById<ImageButton>(R.id.dogIB)
        val cat = findViewById<ImageButton>(R.id.catIB)
        val settings = findViewById<ImageView>(R.id.settingsImg)
        val map = findViewById<ImageView>(R.id.maps)

        guineapig.setOnClickListener {
            val intent = Intent(this, activity_guineapig::class.java)
            startActivity(intent)
        }
        dog.setOnClickListener {
            val intent = Intent(this, activity_dog::class.java)
            startActivity(intent)
        }
        cat.setOnClickListener {
            val intent = Intent(this, activity_cat::class.java)
            startActivity(intent)
        }
        map.setOnClickListener {
            val intent = Intent(this, MapsMarkerActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            val intent = Intent(this, ActivityMenu::class.java)
            startActivity(intent)
        }
    }

}