package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_dog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        val foodDogBtn = findViewById<Button>(R.id.buFeedingDog)
        val exerciseDogBtn = findViewById<Button>(R.id.buExerciseDog)
        val socialDogBtn = findViewById<Button>(R.id.buSocialDog)


        foodDogBtn.setOnClickListener {
            val intent = Intent(this, activity_DogFood::class.java)
            startActivity(intent)
        }
        exerciseDogBtn.setOnClickListener {
            val intent = Intent(this, activity_DogExercise::class.java)
            startActivity(intent)
        }
        socialDogBtn.setOnClickListener {
            val intent = Intent(this, activity_DogSocial::class.java)
            startActivity(intent)
        }
    }
}