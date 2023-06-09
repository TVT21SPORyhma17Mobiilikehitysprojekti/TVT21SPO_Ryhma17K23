package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_guineapig : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guineapig)

        val nailGpBtn = findViewById<Button>(R.id.buNailsGP)
        val buFoodGP = findViewById<Button>(R.id.buFoodGP)
        val buHousingGP = findViewById<Button>(R.id.buHousingGP)
        val buToysGP = findViewById<Button>(R.id.buToysGP)
        val buGPSound = findViewById<ImageView>(R.id.MarsuSoundImg)
        val buMenuGP = findViewById<Button>(R.id.buMenuGp)

        nailGpBtn.setOnClickListener {
            val intent = Intent(this, activity_GpNails::class.java)
            startActivity(intent)
        }

        buFoodGP.setOnClickListener {
            val intent = Intent(this, activity_GpFood::class.java)
            startActivity(intent)
        }
        buHousingGP.setOnClickListener {
            val intent = Intent(this, activity_GpHousing::class.java)
            startActivity(intent)
        }
        buToysGP.setOnClickListener {
            val intent = Intent(this, ActivityGPToys::class.java)
            startActivity(intent)
        }
        buGPSound.setOnClickListener {
            val intent = Intent(this, ActivityGPSounds::class.java)
            startActivity(intent)
        }
        buMenuGP.setOnClickListener {
            val intent = Intent(this, ActivityMenu::class.java)
            startActivity(intent)

        }

    }
}