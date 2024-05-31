package com.example.basicapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()
        val buttonHot=findViewById<Button>(R.id.btnHot)
        val buttonColl=findViewById<Button>(R.id.btnCool)
        val bg=findViewById<LinearLayout>(R.id.main)
        buttonHot.setOnClickListener {
            bg.setBackgroundColor(R.color.red)
        }
        buttonColl.setOnClickListener {
            bg.setBackgroundColor(R.color.blue)
        }
    }
}