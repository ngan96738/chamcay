package com.example.chamcay // Nhớ giữ nguyên package name của bạn ở dòng 1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tạm thời đóng băng (ẩn) toàn bộ code Firebase và ánh xạ giao diện cũ
        // để kiểm tra xem giao diện trang chủ mới có hiển thị thành công trên máy ảo không.

        /*
        // Khi nào cần kết nối dữ liệu thật, chúng ta sẽ mở lại và sửa ID sau:
        tvSoilPercent = findViewById(R.id.tvSoilPercent)
        tvTemperature = findViewById(R.id.tvTemperature)
        ...
        */
    }
}