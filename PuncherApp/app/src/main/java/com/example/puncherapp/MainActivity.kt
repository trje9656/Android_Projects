package com.example.puncherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


fun punchName(view: View){
    val editName = findViewById<EditText>(R.id.editTextFace)
    val imagePunch=findViewById<ImageView>(R.id.face_image)
    val name = editName.text

    val punchText = findViewById<TextView>(R.id.punch_msg)
    punchText.text = "Take That " + name + "!"
    imagePunch.setImageResource(R.drawable.henryface)

}

    fun punchImage(view: View) {
        val imagePunch=findViewById<ImageView>(R.id.face_image)

        //imagePunch.setImageResource(R.drawable.facepunch)

            imagePunch.setImageResource(R.drawable.facepunch)





    }
}