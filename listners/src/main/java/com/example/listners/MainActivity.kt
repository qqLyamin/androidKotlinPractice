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
    }

    fun clickButton(myView: View) {
        when (findViewById<Button>(myView.id)) {
            button3 -> {
                flagTwo = false
                flagOne = false
                if (!flagThree) {
                    flagThree = true
                    findViewById<TextView>(R.id.textView).text = "Button 3 has been pressed"
                }
            }

            button2 -> {
                flagThree = false
                flagOne = false
                if (!flagTwo) {
                    flagTwo = true
                    findViewById<TextView>(R.id.textView).text = "Button 2 has been pressed"
                }
            }

            button1 -> {
                flagTwo = false
                flagThree = false
                if (!flagOne) {
                    flagOne = true
                    findViewById<TextView>(R.id.textView).text = "Button 1 has been pressed"
                }
            }
        }
    }
}
