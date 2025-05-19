package com.griotold.dice_app

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.griotold.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 데이터 바인딩
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener{

            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_SHORT).show()

            val number1 = Random.nextInt(1, 7)
            val number2 = Random.nextInt(1, 7)

            Log.d("MainActivity", number1.toString())
            Log.d("MainActivity", number2.toString())

            // 1번 주사위 세팅
            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if(number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if(number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if(number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if(number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            // 2번 주사위 세팅
            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if(number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if(number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if(number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if(number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }

        }

    }
}