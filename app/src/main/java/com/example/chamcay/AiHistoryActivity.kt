package com.example.chamcay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AiHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_history)

        // Xử lý nút quay lại
        val btnBack = findViewById<TextView>(R.id.btnBack) // Điều chỉnh ID nếu cần
        btnBack?.setOnClickListener { finish() }
    }
}