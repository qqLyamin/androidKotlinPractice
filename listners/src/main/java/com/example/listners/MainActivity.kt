package com.example.listners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var TW = findViewById<TextView>(R.id.textView)
        val Bt1 = findViewById<Button>(R.id.button1)
        val Bt2 = findViewById<Button>(R.id.button2)
        val Bt3 = findViewById<Button>(R.id.button3)

        var flagOne = false
        var flagTwo = false
        var flagThree = false
        Bt1.setOnClickListener {
            flagTwo = false
            flagThree = false
            if (!flagOne) {
                flagOne = true
                TW.text = "Button 1 has been pressed"
            }
        }

        Bt2.setOnClickListener {
            flagOne = false
            flagThree = false
            if (!flagTwo) {
                flagTwo = true
                TW.text = "Button 2 has been pressed"
            }
        }

//        Bt3.setOnClickListener {
//            flagTwo = false
//            flagOne = false
//            if (!flagThree) {
//                flagThree = true
//                TW.text = "Button 3 has been pressed"
//            }
//        }
    }

    fun clickButton3(View view) {

    }
}
