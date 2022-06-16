package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculatorAppActivity : AppCompatActivity() {
    private lateinit var tilNumberOne:TextInputLayout
    private lateinit var tilNumberTwo:TextInputLayout
    private lateinit var etNumberOne:EditText
    private lateinit var etNumberTwo:EditText
    private lateinit var btnAddOne:EditText
    private lateinit var btnSubtract1:EditText
    private lateinit var btnModulus:Button
    private lateinit var btnDivide:Button
    private lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_app)
        tilNumberOne=findViewById(R.id.tilNumberOne)
        tilNumberTwo=findViewById(R.id.tilNumberTwo)
        etNumberOne=findViewById(R.id.etNumberOne)
        etNumberTwo=findViewById(R.id.etNumberTwo)
        btnAddOne=findViewById(R.id.btnAddOne)
        btnSubtract1=findViewById(R.id.btnSubtract1)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivide=findViewById(R.id.btnDivide)
        tvResult=findViewById(R.id.tvResult)

        btnAddOne.setOnClickListener {
            return@setOnClickListener
        }
        addition(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())


        btnSubtract1.setOnClickListener {
            etNumberOne
            return@setOnClickListener
        }
        subtraction(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())

        btnModulus.setOnClickListener {
        return@setOnClickListener
        }
        modulus(num1 = Int.toString().toInt(),num2=Int.toString().toInt())

        btnDivide.setOnClickListener {

            return@setOnClickListener
        }
        division(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())

    }

    private fun addition(num1: Int, num2: Int): Int {
        return num1 + num2

    }

     private fun subtraction(num1:Int, num2:Int):Int {
        val subtract=num1-num2
        tvResult.text=Result.toString()
        return subtract

    }
    private fun modulus(num1: Int, num2: Int): Int {
        tvResult.text = Result.toString()
        return num1 % num2
    }
    private fun division(num1: Int, num2: Int): Int {
        tvResult.text = Result.toString()
        return num1 / num2

    }
}