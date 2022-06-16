package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnCalculatorApp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculatorApp=findViewById(R.id.btnCalculatorApp)

        btnCalculatorApp.setOnClickListener {
            val intent=Intent(this,CalculatorAppActivity::class.java)
            startActivity(intent)

        }
    }
}