package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlantDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        findViewById<TextView>(R.id.btnBack)?.setOnClickListener { finish() }

        // Nhóm 4 chức năng
        findViewById<View>(R.id.btnDetailDiary)?.setOnClickListener {
            startActivity(Intent(this, CareLogActivity::class.java))
        }
        findViewById<View>(R.id.btnDetailJourney)?.setOnClickListener {
            startActivity(Intent(this, GrowthJourneyActivity::class.java))
        }
        findViewById<View>(R.id.btnDetailAI)?.setOnClickListener {
            startActivity(Intent(this, AiHistoryActivity::class.java))
        }
        findViewById<View>(R.id.btnDetailIoT)?.setOnClickListener {
            startActivity(Intent(this, IotSensorDetailsActivity::class.java))
        }

        // Nút chỉnh sửa và xóa
        findViewById<View>(R.id.btnEditPlant)?.setOnClickListener {
            startActivity(Intent(this, ChangeInformationPlantActivity::class.java))
        }
        findViewById<View>(R.id.btnDeletePlant)?.setOnClickListener {
            // Thường sẽ hiện Dialog xác nhận (dialog_delete_plant.xml)
        }
    }
}