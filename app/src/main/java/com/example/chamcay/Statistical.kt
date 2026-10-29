package com.example.chamcay
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class StatisticsMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics_main)
        // Màn hình này dùng BottomNav tương tự MainActivity
    }
}

class StatisticsChartsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics_charts)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
    }
}