package com.example.elainhelp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityCatSounds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_sounds)

        val meowCat = findViewById<Button>(R.id.meowCat)
        val hissCat = findViewById<Button>(R.id.hissCat)
        val growlingCat = findViewById<Button>(R.id.murCat)
        val purrCat = findViewById<Button>(R.id.purrCat)
        val stop = findViewById<Button>(R.id.catStopBtn)
        var mediaplayer = MediaPlayer()


        meowCat.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.kissameow))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        hissCat.setOnClickListener {
            mediaplayer.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.kissasahina))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        growlingCat.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.kissamurina))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        purrCat.setOnClickListener {
            mediaplayer.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.kissapurr))
            mediaplayer.prepare()
            mediaplayer.start()
        }

        stop.setOnClickListener{
            mediaplayer.stop()
            mediaplayer.release()
            mediaplayer= MediaPlayer()
        }

    }
}