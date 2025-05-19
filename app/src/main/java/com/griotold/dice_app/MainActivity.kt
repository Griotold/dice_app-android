package com.griotold.dice_app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.griotold.dice_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 데이터 바인딩
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.diceStartBtn.setOnClickListener{

            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_SHORT).show()
        }

    }
}