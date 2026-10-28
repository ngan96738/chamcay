package com.example.chamcay

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CareLogActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_care_log)

        // 1. Nút Back quay lại
        val btnBack = findViewById<TextView>(R.id.btnBack)
        btnBack?.setOnClickListener {
            finish()
        }

        // 2. Xử lý Dropdown loại chăm sóc
        val spinnerCareType = findViewById<LinearLayout>(R.id.spinnerCareType)
        val tvCareType = findViewById<TextView>(R.id.tvCareType)
        val layoutNextDate = findViewById<LinearLayout>(R.id.layoutNextDate)
        val tvDynamicHint = findViewById<TextView>(R.id.tvDynamicHint)

        layoutNextDate?.visibility = View.GONE

        spinnerCareType?.setOnClickListener { view ->
            val popup = PopupMenu(this@CareLogActivity, view)
            popup.menu.add("Tưới nước")
            popup.menu.add("Bón phân")
            popup.menu.add("Cắt tỉa")
            popup.menu.add("Thay đất")

            popup.setOnMenuItemClickListener { item ->
                val selectedItem = item.title.toString()
                tvCareType?.text = selectedItem

                if (selectedItem == "Tưới nước") {
                    layoutNextDate?.visibility = View.GONE
                    tvDynamicHint?.text = "Chọn 'Bón phân' để nhập Loại phân thay cho Khối lượng."
                } else {
                    layoutNextDate?.visibility = View.VISIBLE
                    if (selectedItem == "Bón phân") {
                        tvDynamicHint?.text = "Nhập loại phân bón và liều lượng sử dụng."
                    } else {
                        tvDynamicHint?.text = "Nhập thêm thông tin khối lượng/thể tích nếu cần."
                    }
                }
                true
            }
            popup.show()
        }
    }
}