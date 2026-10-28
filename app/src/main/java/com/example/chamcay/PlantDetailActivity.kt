package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlantDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        // Nút Back quay lại
        findViewById<TextView>(R.id.btnBack)?.setOnClickListener {
            finish()
        }

        // 4 nút chức năng phía dưới (Nhật ký, Hành trình, AI, IoT)
        findViewById<LinearLayout>(R.id.btnDetailDiary)?.setOnClickListener {
            startActivity(Intent(this, CareLogActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnDetailJourney)?.setOnClickListener {
            startActivity(Intent(this, GrowthJourneyActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnDetailAI)?.setOnClickListener {
            startActivity(Intent(this, AiHistoryActivity::class.java))
        }

        findViewById<LinearLayout>(R.id.btnDetailIoT)?.setOnClickListener {
            startActivity(Intent(this, IotMonitoringActivity::class.java))
        }
    }
}