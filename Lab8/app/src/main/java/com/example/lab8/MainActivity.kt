package com.example.lab8

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial
//https://developer.android.com/training/basics/intents/sending
class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE = 1
    lateinit var pageswitch : Button
    lateinit var blackjack : Button
    lateinit var EightballButton : Button
    lateinit var coinButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pageswitch = findViewById(R.id.pageswitch)
        blackjack = findViewById(R.id.BlackjackButton)
        EightballButton = findViewById(R.id.EightballButton)
        coinButton = findViewById(R.id.coinButton)




        pageswitch.setOnClickListener {


            //create intent
            val intent = Intent(this, MainActivity2::class.java)


            startActivityForResult(intent, REQUEST_CODE)
        }


    }
    fun blackjackSwitch(view: View){
        val webIntent: Intent = Uri.parse("https://html5blackjack.net/").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)

    }

    fun coinSwitch(view: View){
        val webIntent: Intent = Uri.parse("https://flipsimu.com/").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)
    }

    fun EightBallSwitch(view: View){
        val webIntent: Intent = Uri.parse("http://www.ask8ball.net/").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)
    }
}