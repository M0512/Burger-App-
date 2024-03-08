package com.example.radiobuttonandcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.radiobuttonandcheckbox.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnorder.setOnClickListener {
            val checkedId = binding.rgmeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedId)
            val onions = binding.cbonions.isChecked
            val salads = binding.cbsalad.isChecked
            val cheese = binding.cbcheese.isChecked
            binding.teshow.setText("you have ordered a burger with " +
                    meat.text +
                    (if (cheese) "\n cheese" else " ") +
                    (if (onions) "\n Onions" else " ") +
                    (if (salads) "\n salad" else " "))

        }
    }
}