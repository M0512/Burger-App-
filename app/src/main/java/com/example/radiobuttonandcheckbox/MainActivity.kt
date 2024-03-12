package com.example.radiobuttonandcheckbox

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.radiobuttonandcheckbox.databinding.ActivityMainBinding
import com.example.radiobuttonandcheckbox.databinding.CustomtoastBinding


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
            binding.teshow.setText("you have ordered a " +meat.text +" burger with " +
                    (if (cheese) "\n cheese" else " ") +
                    (if (onions) "\n Onions" else " ") +
                    (if (salads) "\n salad" else " "))



            Toast(this).apply{
                duration=Toast.LENGTH_LONG
                view= CustomtoastBinding.inflate(layoutInflater).clnoticon
                show()


            }


        }
    }
}