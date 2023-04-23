package com.example.elainhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import java.util.*

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buTheme = findViewById<Button>(R.id.buTheme)

        val changeLanguageButton = findViewById<Button>(R.id.buLanguage)
        val termsBtn = findViewById<Button>(R.id.buTerms)
        changeLanguageButton.setOnClickListener {
            val locale = Locale("en")
            Locale.setDefault(locale)
            val resources = resources
            val configuration = resources.configuration
            configuration.setLocale(locale)
            recreate()

        }

        val buScreen = findViewById<Button>(R.id.buScreen)

        buScreen.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        termsBtn.setOnClickListener {
            val intent = Intent(this, ActivityTerms::class.java)
            startActivity(intent)
        }
        buTheme.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)


        }



    }
}
