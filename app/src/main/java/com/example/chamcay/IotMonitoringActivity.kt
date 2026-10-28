package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class IotMonitoringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iot_monitoring)

        // Ví dụ: Bấm nút chuyển sang màn hình Chi tiết cảm biến (IotSensorDetailsActivity)
        // val btnDetails = findViewById<MaterialButton>(R.id.btnSensorDetails)
        // btnDetails.setOnClickListener {
        //     startActivity(Intent(this, IotSensorDetailsActivity::class.java))
        // }
    }
}