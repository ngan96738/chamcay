package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Bấm vào phần Môi trường (Cảm biến) -> Chuyển sang Giám sát IoT
        findViewById<View>(R.id.cardIotMonitoring)?.setOnClickListener {
            startActivity(Intent(this, IotMonitoringActivity::class.java))
        }

        // 2. Bấm vào nút Thêm cây -> Chuyển sang màn hình danh sách cây
        findViewById<View>(R.id.btnAddPlant)?.setOnClickListener {
            startActivity(Intent(this, MyPlantsActivity::class.java))
        }

        // 3. Bấm vào AI tư vấn -> Chuyển sang lịch sử AI
        findViewById<View>(R.id.btnAiConsult)?.setOnClickListener {
            startActivity(Intent(this, AiHistoryActivity::class.java))
        }

        // 4. Bấm vào biểu tượng Thông báo (chuông) ở góc trên
        findViewById<View>(R.id.btnNotification)?.setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
        }

        // 5. Điều hướng thanh menu dưới cùng (Bottom Navigation)
        findViewById<View>(R.id.navHome)?.setOnClickListener {
            // Đang ở Trang chủ
        }

        // Tab Cây của tôi -> Mở danh sách cây (activity_my_plants)
        findViewById<View>(R.id.navPlants)?.setOnClickListener {
            startActivity(Intent(this, MyPlantsActivity::class.java))
        }

        // Tab Nhật ký -> Mở màn hình nhật ký chăm sóc (CareLogActivity)
        findViewById<View>(R.id.navDiary)?.setOnClickListener {
            startActivity(Intent(this, CareLogActivity::class.java))
        }

        // Tab Thống kê -> Mở hành trình phát triển
        findViewById<View>(R.id.navStats)?.setOnClickListener {
            startActivity(Intent(this, GrowthJourneyActivity::class.java))
        }

        // Tab Tài khoản
        findViewById<View>(R.id.navAccount)?.setOnClickListener {
            // Xử lý màn hình tài khoản nếu có
        }
    }
}