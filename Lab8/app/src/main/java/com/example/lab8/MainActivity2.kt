package com.example.lab8

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var BackstoryButton : Button
    lateinit var RPGButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        RPGButton = findViewById(R.id.RPGButton)
        BackstoryButton = findViewById(R.id.BackstoryButton)


    }

    fun BackstorySwitch(view: View){
        val webIntent: Intent = Uri.parse("https://en.shindanmaker.com/519584").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)

    }

    fun RPGSwitch(view: View){
        val webIntent: Intent = Uri.parse("https://en.shindanmaker.com/645752").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)
    }
}