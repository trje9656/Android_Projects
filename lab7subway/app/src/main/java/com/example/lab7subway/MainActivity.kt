package com.example.lab7subway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createSandwich(view: View) {
        var filling: CharSequence = ""
        var toppinglist = "" //String
        var total = 10

        //views
        val radioGroup = findViewById<RadioGroup>(R.id.sandSize)
        val fillingId = radioGroup.checkedRadioButtonId
        val messageTextView = findViewById<TextView>(R.id.orderText)
        val totalTextView = findViewById<TextView>(R.id.textViewTotal)
        val layoutRoot = findViewById<ConstraintLayout>(R.id.root_layout)
        val checkBox1 = findViewById<CheckBox>(R.id.checkHam)
        val checkBox2 = findViewById<CheckBox>(R.id.checkLettuce)
        val checkBox3 = findViewById<CheckBox>(R.id.checkSwiss)
        val checkBox4 = findViewById<CheckBox>(R.id.checkOnion)
        val checkBox5 = findViewById<CheckBox>(R.id.checkTomato)
        val checkBox6 = findViewById<CheckBox>(R.id.checkMayo)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val switch = findViewById<SwitchMaterial>(R.id.wheatSwitch)

        if (fillingId == -1) {
            Log.i("if statement", "$fillingId")
            //Snackbar
            val sizeSnackbar =
                Snackbar.make(layoutRoot, "Please select a size", Snackbar.LENGTH_SHORT)
            sizeSnackbar.show()

        } else {
            Log.i("else statement", "$fillingId")
            filling = findViewById<RadioButton>(fillingId).text

            /*if (switch.isChecked) {
                filling = switch.text.toString() + " $filling"
            }*/

            //checkboxes
            if (checkBox1.isChecked) {
                toppinglist += " " + checkBox1.text
                total += 1
            }
            if (checkBox2.isChecked) {
                toppinglist += " " + checkBox2.text
                total += 1
            }
            if (checkBox3.isChecked) {
                toppinglist += " " + checkBox3.text
                total += 1
            }
            if (checkBox4.isChecked) {
                toppinglist += " " + checkBox4.text
                total += 1
            }
            if (checkBox5.isChecked) {
                toppinglist += " " + checkBox5.text
                total += 1
            }
            if (checkBox6.isChecked) {
                toppinglist += " " + checkBox6.text
                total += 1
            }
            if (toppinglist.isNotEmpty()) {
                toppinglist = "with" + toppinglist
            }

            //conditional expression
            //toppinglist = (if (toppinglist.isNotEmpty()) "with$toppinglist" else "").toString()

            //spinner
            val location = "at " + spinner.selectedItem

            //switch


            //textview
            if (!switch.isChecked) {
                messageTextView.text = "You'd like a white $filling sub $toppinglist $location"
            }
            else {
                messageTextView.text = "You'd like a wheat $filling sub $toppinglist $location"
            }
            totalTextView.text = "Total is $" + total.toString()
        }
    }
}