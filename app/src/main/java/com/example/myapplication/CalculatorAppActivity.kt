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
            val num1=etNumberOne.text.toString()
            val num2=etNumberTwo.text.toString()

        }
        addition(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())


        btnSubtract1.setOnClickListener {
            val num1=etNumberOne.text.toString()
            val num2=etNumberTwo.text.toString()
        }
        subtraction(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())

        btnModulus.setOnClickListener {
            val num1=etNumberOne.text.toString()
            val num2=etNumberTwo.text.toString()
        }
        modulus(num1 = Int.toString().toInt(),num2=Int.toString().toInt())

        btnDivide.setOnClickListener {
            val num1=etNumberOne.text.toString()
            val num2=etNumberTwo.text.toString()
            return@setOnClickListener
        }
        division(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())

    }

    private fun addition(num1: Int, num2: Int): Int {
        val add=num1+num2
        tvResult.text=Result.toString()
        return add

    }

     private fun subtraction(num1:Int, num2:Int):Int {
        val subtract=num1-num2
        tvResult.text=Result.toString()
        return subtract

    }
    private fun modulus(num1: Int, num2: Int): Int {
        val mod=num1%num2
        tvResult.text = Result.toString()
        return mod
    }
    private fun division(num1: Int, num2: Int): Int {
        val divide=num1/num2
        tvResult.text = Result.toString()
        return divide

    }
}