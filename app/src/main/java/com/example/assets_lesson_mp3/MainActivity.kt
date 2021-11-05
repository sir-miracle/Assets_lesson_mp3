package com.example.assets_lesson_mp3

import android.media.MediaParser
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = findViewById<TextView>(R.id.textView1)
//        textView.text = getstringFromAssetsFile()
//
//        getstringFromAssetsFile()
        playSong()
    }


    //...accesing mp3 file from the raw folder

    fun playSong() {
        var song: MediaPlayer

        song = MediaPlayer.create(applicationContext, R.raw.lil_wanye)
        var button = findViewById<Button>(R.id.music_player)
        var pause = findViewById<Button>(R.id.music_pause)
        button.setOnClickListener {
            song.start()
        }
        pause.setOnClickListener {
            song.pause()
        }



    }



    //........accesing a string from the Assets folder

//    private fun getstringFromAssetsFile():String{
//        var str = ""
//
//        try {
//
//
//    val inputStream = assets.open("sampletext.txt")
//    val size = inputStream.available()
//    val byteArray = ByteArray(size)
//    inputStream.read(byteArray)
//    str += String(byteArray)
//    Log.d("Main", str)
//        }
//        catch (io:IOException){
//            Log.e("MAin", io.message.toString())
//        }
//        return str
// }
}