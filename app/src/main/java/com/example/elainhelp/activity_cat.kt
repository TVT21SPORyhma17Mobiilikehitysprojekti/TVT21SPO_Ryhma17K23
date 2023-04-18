package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_cat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)


        val foodCatBtn = findViewById<Button>(R.id.buFeedingCat)
        val teethCatBtn = findViewById<Button>(R.id.buTeethCat)
        val socialCatBtn = findViewById<Button>(R.id.buSocialCat)


        foodCatBtn.setOnClickListener {
            val intent = Intent(this, activity_CatFood::class.java)
            startActivity(intent)

        }
        teethCatBtn.setOnClickListener {
            val intent = Intent(this, activity_CatTeethClaws::class.java)
            startActivity(intent)

        }
        socialCatBtn.setOnClickListener {
            val intent = Intent(this, activity_CatSocial::class.java)
            startActivity(intent)

        }
    }

}