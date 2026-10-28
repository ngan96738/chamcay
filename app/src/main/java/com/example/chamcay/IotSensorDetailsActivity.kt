package com.example.chamcay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IotSensorDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iot_sensor_details)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        btnBack?.setOnClickListener { finish() }
    }
}