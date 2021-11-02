package com.example.puncherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


fun punchName(view: View){
    val editName = findViewById<EditText>(R.id.editTextFace)
    val name = editName.text

    val punchText = findViewById<TextView>(R.id.punch_msg)
    punchText.text = "Take That " + name + "!"

}

}