package com.example.inchestocentimeter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val raito = 2.54
    private lateinit var imagev: ImageView
    private lateinit var button: Button
    private lateinit var edit: EditText
    private lateinit var textv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imagev = findViewById(R.id.imageView)
        button = findViewById(R.id.button)
        edit = findViewById(R.id.editTextText)
        textv = findViewById(R.id.textView)

        button.setOnClickListener {

            if (!edit.text.toString().isEmpty()) {

                val res = edit.text.toString().toDouble() * raito

                textv.text = "Total Centimeter = ${res}"


            } else {
                textv.text = getString(R.string.text)
            }
        }
    }
}