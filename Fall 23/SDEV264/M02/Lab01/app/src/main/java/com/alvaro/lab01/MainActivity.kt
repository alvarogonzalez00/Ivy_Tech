package com.alvaro.lab01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvaro.lab01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val n1 = binding.Number1.text
        val n2 = binding.Number2.text

        binding.buttonPlus.setOnClickListener {

            val sumResult = n1.toString().toDouble() + n2.toString().toDouble()
            binding.resultView.text = sumResult.toString()
        }
       //Addition calculation and display

        binding.buttonMinus.setOnClickListener {
            val subtractResult = n1.toString().toDouble() - n2.toString().toDouble()
            binding.resultView.text = subtractResult.toString()
        }
        //Subtraction calculation and display

        binding.buttonMultiply.setOnClickListener {
            val multiResult = n1.toString().toDouble() * n2.toString().toDouble()
            binding.resultView.text = multiResult.toString()
        }
        //Multiplication calculation and display

        binding.buttonDiv.setOnClickListener {
            val divResult = n1.toString().toDouble() / n2.toString().toDouble()
            binding.resultView.text = divResult.toString()
        }
        //Division calculation and display
        }
    }
