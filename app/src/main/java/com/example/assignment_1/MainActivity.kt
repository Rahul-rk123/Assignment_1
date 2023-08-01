package com.example.assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ca = findViewById<Button>(R.id.button)
        ca.setOnClickListener(){
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}