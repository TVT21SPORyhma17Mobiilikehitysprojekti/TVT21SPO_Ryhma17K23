package com.example.elainhelp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityGPSounds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpsounds)


        val wheek = findViewById<Button>(R.id.WheekGP)
        val chatting = findViewById<Button>(R.id.ChattingGP)
        val angry = findViewById<Button>(R.id.angryGP)
        val fear = findViewById<Button>(R.id.fearGP)

        val stopGP = findViewById<Button>(R.id.StopGP)
        var mediaplayer = MediaPlayer()


        wheek.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.wheekmarsu))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        chatting.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.juttelevamarsu))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        angry.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.vihainenmarsu))
            mediaplayer.prepare()
            mediaplayer.start()
        }
        fear.setOnClickListener{
            mediaplayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.pelastynytmarsu))
            mediaplayer.prepare()
            mediaplayer.start()
        }

        stopGP.setOnClickListener{
            mediaplayer.stop()
            mediaplayer.release()
            mediaplayer=MediaPlayer()
        }

    }
}