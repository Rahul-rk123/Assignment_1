package com.example.assignment_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val rd = findViewById<Button>(R.id.button3)
        rd.setOnClickListener{
            val number = Uri.parse("tel:7409420086")
            intent = Intent(Intent.ACTION_DIAL, number)
            startActivity(intent)
        }
        val sd = findViewById<CardView>(R.id.card1)
        sd.setOnClickListener {
            intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }
        val kd = findViewById<CardView>(R.id.card2)
        kd.setOnClickListener {
            intent = Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)
        }
        val ld = findViewById<CardView>(R.id.card3)
        ld.setOnClickListener {
            intent = Intent(applicationContext,MainActivity5::class.java)
            startActivity(intent)
        }
        val ad = findViewById<CardView>(R.id.card4)
        ad.setOnClickListener {
            intent = Intent(applicationContext,MainActivity6::class.java)
            startActivity(intent)
        }
        val vd = findViewById<CardView>(R.id.card5)
        vd.setOnClickListener {
            intent = Intent(applicationContext,MainActivity7::class.java)
            startActivity(intent)
        }
        val cd = findViewById<CardView>(R.id.card6)
        cd.setOnClickListener {
            intent = Intent(applicationContext,MainActivity8::class.java)
            startActivity(intent)
        }

    }
}