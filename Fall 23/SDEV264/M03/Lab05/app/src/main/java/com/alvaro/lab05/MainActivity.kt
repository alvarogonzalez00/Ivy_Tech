package com.alvaro.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvaro.lab05.databinding.ActivityMainBinding
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun placeOrderButtonClicked (view: View) {
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0

        when {
            binding.smallpizza.isChecked -> pizzaSizePrice = 5.0
            binding.mediumpizza.isChecked -> pizzaSizePrice = 7.0
            binding.largepizza.isChecked -> pizzaSizePrice = 9.0}

        if (binding.OnionsCheckBox.isChecked) {toppingsTotal += 1}
        if (binding.OlivesCheckBox.isChecked) {toppingsTotal += 2}
        if (binding.TomatoesCheckBox.isChecked) {toppingsTotal += 3}

        val totalPrice = pizzaSizePrice + toppingsTotal

    binding.totalPrice.text = "Total Order Price: $$totalPrice"

    }
}