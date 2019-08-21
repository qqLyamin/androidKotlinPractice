package com.example.logsandmess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var flagOk = true
    var flagCancel = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "Присваеваем обработчик кнопкам")
    }
    fun onClick(myView: View) {
        when (findViewById<Button>(myView.id)) {
            btnOk -> {
                if (flagOk) {
                    Log.d("TAG", "Knopka Ok")
                    findViewById<TextView>(R.id.tvOut).text = "Ok pressed"
                    Toast.makeText(this, "THAT WAS OK, I know it)))", Toast.LENGTH_LONG).show()
                    flagOk = false
                    flagCancel = true
                }
            }
            btnCancel -> {
                if (flagCancel) {
                    Log.d("TAG", "Knopka Cancel")
                    findViewById<TextView>(R.id.tvOut).text = "Cancel pressed"
                    Toast.makeText(this, "THAT WAS CANCEL, I know it)))", Toast.LENGTH_LONG).show()
                    flagCancel = false
                    flagOk = true
                }
            }
        }
    }
}
