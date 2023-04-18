package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_cat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        val buMenuCat = findViewById<Button>(R.id.buMenu_cat)

        buMenuCat.setOnClickListener {
            val intent = Intent(this, ActivityMenu::class.java)
            startActivity(intent)
        }
    }
}