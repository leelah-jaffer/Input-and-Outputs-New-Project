package com.example.inputandoutputnewproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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
    }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}