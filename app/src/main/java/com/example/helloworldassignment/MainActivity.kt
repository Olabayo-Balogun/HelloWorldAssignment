package com.example.helloworldassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var increaseButton =findViewById<Button>(R.id.incrementButton)
        var decreaseButton = findViewById<Button>(R.id.decrementButton)
        var counterView = findViewById<TextView>(R.id.counter)

        var number = 0;
        increaseButton.setOnClickListener {
            number++
            counterView.setText(number.toString())
        }

        decreaseButton.setOnClickListener {
            number--
            counterView.setText(number.toString())
        }
    }
}

