package com.example.uibasic

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.text_views)

        val btn = findViewById<Button>(R.id.btn_submit)

        btn.setOnClickListener {
            Toast.makeText(this, "Submitted Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}