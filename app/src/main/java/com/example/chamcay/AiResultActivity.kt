package com.example.chamcay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AiResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_result)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        btnBack?.setOnClickListener { finish() }
    }
}