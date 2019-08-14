package com.example.viewelementsformat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Btn = findViewById<Button>(R.id.MyButton)
        val myChb = findViewById<CheckBox>(R.id.checkBox)
        myChb.setOnClickListener {
            Btn.isEnabled = !myChb.isChecked
        }
        val myTextView = findViewById<TextView>(R.id.myText)
        myTextView.text = "Yoyo Android"
        var flag = false
        Btn.setOnClickListener {
            flag = !flag
            if (flag) {
                myTextView.text = "Don't touch the button!"
            } else {
                myTextView.text = "I SAID !!!!!! Don't touch the FUCKING button!"
            }
        }

    }
}
