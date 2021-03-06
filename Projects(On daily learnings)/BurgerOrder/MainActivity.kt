// This is a Kotlin code

package com.example.firstandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

// Class MainActivity inheriting from Class AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOrder.setOnClickListener {

            // Here we're getting the ID of the RadioButton who is checked
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId

            // And here we're getting that view by the ID of the Button
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            // Storing for each checkbox whether they're checked or not
            val cheese = cbCheese.isChecked
            val onions = cbOnion.isChecked
            val salad = cbSalad.isChecked

            // Select the display output once the order is decided
            val orderString = "You ordered a burger with: \n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "") +
                    (if(onions) "\nOnions" else "") +
                    (if(salad) "\nSalad" else "")

            tvOrder.text = orderString
        }
    }
}
