package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MyPlantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_plants)

        // Ví dụ: Bấm vào mục cây bất kỳ trong danh sách sẽ mở màn hình Chi tiết cây
        // (Ngân có thể gắn ID của card cây trong XML để bấm vào)
    }
}