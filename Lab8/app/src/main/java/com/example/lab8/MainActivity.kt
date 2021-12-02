package com.example.lab8

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE = 1
    lateinit var pageswitch : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pageswitch = findViewById(R.id.pageswitch)


        pageswitch.setOnClickListener {
           /* selectedLocationPosition = spinner.selectedItemPosition
            myTacoShop.suggestTacoShop(selectedLocationPosition)
            Log.i("shop suggested", myTacoShop.name);
            Log.i("url suggested", myTacoShop.url);*/

            //create intent
            val intent = Intent(this, MainActivity2::class.java)
            /*intent.putExtra("tacoShopName", myTacoShop.name)
            intent.putExtra("tacoShopURL", myTacoShop.url)*/

            startActivityForResult(intent, REQUEST_CODE)
        }


    }
}