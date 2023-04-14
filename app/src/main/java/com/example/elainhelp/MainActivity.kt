package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guineapig = findViewById<ImageButton>(R.id.guineapigIB)
        val dog = findViewById<ImageButton>(R.id.dogIB)
        val cat = findViewById<ImageButton>(R.id.catIB)
        guineapig.setOnClickListener {
            val intent = Intent(this, activity_guineapig::class.java)
            startActivity(intent)
        }
    }

}