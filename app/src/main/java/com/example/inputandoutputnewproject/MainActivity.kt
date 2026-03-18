package com.example.inputandoutputnewproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

    //Get Button using ID
    val clickMeButton = findViewById<Button>(R.id.buttonText)

    //Add code to button
    clickMeButton?.setOnClickListener{
        Toast.makeText(this@MainActivity,
            "Successfully Clicked", Toast.LENGTH_LONG).show()

    }
        setContentView(R.layout.activity_main)

        //Get the Text View using ID and edit Text
    val welcomeTextView =
        findViewById<TextView>(R.id.displayText)
    val nameEditText = findViewById<TextView>(R.id.nameText)

    //Add code to the button that happens when clicked
    clickMeButton.setOnClickListener {
        welcomeTextView.text = "Welcome, ${nameEditText}.text}!"

        //get the switch that turns on the zulu greeting
        val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)

        // add the code to the button
        clickMeButton?.setOnClickListener {
            var greeting: String
            var zulu: Boolean = zuluSwitch.isChecked
            if (zulu) {
                greeting = "Sawubona, ${nameEditText.text}!"
            } else {
                // easter egg for Aqeelah
                if (nameEditText.text.toString() == "Aqeelah" ||
                    nameEditText.text.toString()== "Sam") {
                    greeting = "Yo, ${nameEditText.text}!"
                } else {
                    greeting = "greetings, ${nameEditText.text}!"
                }
            }
            welcomeTextView.text = greeting




            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
                }
            }
        }
    }
}