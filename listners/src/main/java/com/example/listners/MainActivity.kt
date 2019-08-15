package com.example.listners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

var flagOne = false
var flagTwo = false
var flagThree = false

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var TW = findViewById<TextView>(R.id.textView)
        val Bt1 = findViewById<Button>(R.id.button1)
        val Bt2 = findViewById<Button>(R.id.button2)
        val Bt3 = findViewById<Button>(R.id.button3)

        var flagOne = false

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

    fun clickButton3(myView: View) {
        if (findViewById<Button>(myView.id) == button3) {
            flagTwo = false
            flagOne = false
            if (!flagThree) {
                flagThree = true
                findViewById<TextView>(R.id.textView).text = "Button 3 has been pressed"
            }
        }
    }
}
