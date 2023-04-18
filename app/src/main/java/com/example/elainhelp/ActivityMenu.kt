package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val startScreen = findViewById<Button>(R.id.startScreen)

        setContentView(R.layout.activity_menu)
        startScreen.setOnClickListener {
            val intent = Intent(this, activity_menu::class.java)
            startActivity(intent)
        }
    }
}