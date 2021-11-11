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

    var orderString: String = ""
    var totalString: String = ""

    var total: Int = 10

    lateinit var  radioGroup : RadioGroup
        lateinit var  messageTextView : TextView
    lateinit var  totalTextView : TextView
        lateinit var  layoutRoot : ConstraintLayout
    lateinit var  checkBox1 : CheckBox
        lateinit var  checkBox2 : CheckBox
    lateinit var  checkBox3 : CheckBox
        lateinit var  checkBox4 : CheckBox
    lateinit var  checkBox5 : CheckBox
    lateinit var  checkBox6 : CheckBox
    lateinit var  spinner : Spinner
        lateinit var  switch : SwitchMaterial
    var fillingId = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //radioGroup = findViewById<RadioGroup>(R.id.sandSize)
        radioGroup = findViewById(R.id.sandSize)
         messageTextView = findViewById(R.id.orderText)
         totalTextView = findViewById(R.id.textViewTotal)
         layoutRoot = findViewById(R.id.root_layout)
         checkBox1 = findViewById<CheckBox>(R.id.checkHam)
         checkBox2 = findViewById(R.id.checkLettuce)
         checkBox3 = findViewById(R.id.checkSwiss)
         checkBox4 = findViewById(R.id.checkOnion)
         checkBox5 = findViewById(R.id.checkTomato)
         checkBox6 = findViewById(R.id.checkMayo)
         spinner = findViewById(R.id.spinner)
         switch = findViewById(R.id.wheatSwitch)



    }

    fun createSandwich(view: View) {
        var filling: CharSequence = ""
        var toppinglist: String = "" //String
        total = 10

         fillingId = radioGroup.checkedRadioButtonId

        //views



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
                orderString = "You'd like a white $filling sub $toppinglist $location"
            } else {
                orderString = "You'd like a wheat $filling sub $toppinglist $location"
            }
            totalString = "Total is $" + total.toString()
            messageTextView.text = orderString
            totalTextView.text = totalString
        }
    }



}