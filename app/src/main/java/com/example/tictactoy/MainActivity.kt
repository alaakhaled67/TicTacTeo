package com.example.tictactoy

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt1=findViewById<Button>(R.id.button5)
        bt1.setOnClickListener {
            val i = Intent(this,choose::class.java)
            startActivity(i)
        }
        val bt2=findViewById<Button>(R.id.button6)
        bt2.setOnClickListener {
            val i = Intent(this,play2::class.java)
            startActivity(i)
        }
    }
}