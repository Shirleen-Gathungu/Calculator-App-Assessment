package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityCalculatorAppBinding
import com.google.android.material.textfield.TextInputLayout

class CalculatorAppActivity : AppCompatActivity() {
    lateinit var binding: ActivityCalculatorAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleClicks()
    }
        fun handleClicks() {
            binding.btnAddOne.setOnClickListener {
                addition(obtainInputs())

            }
            binding.btnSubtract1.setOnClickListener {
                subtraction(obtainInputs())

            }
            binding.btnModulus.setOnClickListener {
                modulus(obtainInputs())

            }
            binding.btnDivide.setOnClickListener {
                division(obtainInputs())

            }

        }

        //        binding.btnAddOne.setOnClickListener {
//            val num1=binding.etNumberOne.text.toString()
//            val num2=binding.etNumberTwo.text.toString()
//
//        }
//        addition(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())
//
//
//        binding.btnSubtract1.setOnClickListener {
//            val num1=binding.etNumberOne.text.toString()
//            val num2=binding.etNumberTwo.text.toString()
//        }
//        subtraction(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())
//
//        binding.btnModulus.setOnClickListener {
//            val num1=binding.etNumberOne.text.toString()
//            val num2=binding.etNumberTwo.text.toString()
//        }
//        modulus(num1 = Int.toString().toInt(),num2=Int.toString().toInt())
//
//        binding.btnDivide.setOnClickListener {
//            val num1=binding.etNumberOne.text.toString()
//            val num2=binding.etNumberTwo.text.toString()
//        }
//        division(num1 = Int.toString().toInt(), num2 = Int.toString().toInt())
//
//    }
        data class Inputs(var num1: Double, var num2: Double)

        fun obtainInputs(): Inputs? {
            binding.tilNumberOne.error=null
            binding.tilNumberTwo.error=null
            val num1 = binding.etNumberOne.text.toString()
            val num2 = binding.etNumberTwo.text.toString()
            var error = false

            if (num1.isBlank()) {
                binding.tilNumberOne.error = "Number 1 required"
                error = true
            }
            if (num2.isBlank()) {
                binding.tilNumberTwo.error = "Number 2 is required"
                error = true
            }
            if (!error) {
                return Inputs(num1.toDouble(),num2.toDouble())
            }
            return null
        }
        fun addition(inputs:Inputs?) {
            if(inputs!=null) {
                displayResult(inputs.num1 + inputs.num2)

            }
        }

        fun subtraction(inputs:Inputs?) {
            if(inputs!=null) {
                displayResult(inputs.num1 - inputs.num2)

            }


        }

        fun modulus(inputs:Inputs?) {
            if(inputs!=null) {
                displayResult(inputs.num1 % inputs.num2)

            }

        }

        fun division(inputs:Inputs?) {
            if(inputs!=null) {
                displayResult(inputs.num1 / inputs.num2)

            }

        }
    fun displayResult(result:Double){
        binding.tvResult.text=result.toString()
    }

}

