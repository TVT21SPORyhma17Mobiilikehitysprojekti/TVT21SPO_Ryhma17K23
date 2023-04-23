package com.example.elainhelp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_DogSounds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_sounds)

        val bark = findViewById<Button>(R.id.BarkBtn)
        val barkAngry = findViewById<Button>(R.id.BarkAngryBtn)
        val whine = findViewById<Button>(R.id.whineBtn)
        val howl = findViewById<Button>(R.id.howlBtn)
        val stop = findViewById<Button>(R.id.StopBtn)
        var mediaplayer = MediaPlayer()


        bark.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.dogbark))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        barkAngry.setOnClickListener {
            mediaplayer.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.angrydog))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        whine.setOnClickListener {
            mediaplayer.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.koiravinku))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        howl.setOnClickListener {
            mediaplayer.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.koiraulvonta))
            mediaplayer.prepare()
            mediaplayer.start()
        }

        stop.setOnClickListener{
            mediaplayer.stop()
            mediaplayer.release()
            mediaplayer=MediaPlayer()
        }

    }

}