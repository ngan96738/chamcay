package com.example.chamcay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GrowthJourneyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_growth_journey)

        // Ánh xạ nút quay lại vì XML đã có id btnBack
        val btnBack = findViewById<TextView>(R.id.btnBack)
        btnBack?.setOnClickListener { finish() }
    }
}