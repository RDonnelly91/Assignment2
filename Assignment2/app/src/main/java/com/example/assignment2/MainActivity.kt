package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignment2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun convertCurrency(view: View) {
        if (binding.dollarText.text.isNotEmpty()) {
            val dollarValue = binding.dollarText.text.toString().toFloat()
            val totalWithTip1 = (dollarValue * 0.10f) + dollarValue
            val totalWithTip2 = (dollarValue * 0.15f) + dollarValue
            val totalWithTip3 = (dollarValue * 0.20f) + dollarValue
            binding.textView.text = totalWithTip1.toString()
            binding.textView2.text = totalWithTip2.toString()
            binding.textView3.text = totalWithTip3.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
            binding.textView2.text = " "
            binding.textView3.text = " "
        }
    }
}