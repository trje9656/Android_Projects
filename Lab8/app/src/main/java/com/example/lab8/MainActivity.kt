package com.example.lab8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*locationButton.setOnClickListener {
            selectedLocationPosition = spinner.selectedItemPosition
            myTacoShop.suggestTacoShop(selectedLocationPosition)
            Log.i("shop suggested", myTacoShop.name);
            Log.i("url suggested", myTacoShop.url);

            //create intent
            val intent = Intent(this, TacoActivity::class.java)
            intent.putExtra("tacoShopName", myTacoShop.name)
            intent.putExtra("tacoShopURL", myTacoShop.url)

            startActivityForResult(intent, REQUEST_CODE)
        }*/


    }
}