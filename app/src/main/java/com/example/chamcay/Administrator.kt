package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

// 1. Màn hình Tổng quan Quản trị
class AdminDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        // Nút Quản lý người dùng (MaterialButton màu xanh)
        findViewById<View>(R.id.btnManageUsers)?.setOnClickListener {
            val intent = Intent(this@AdminDashboardActivity, AdminUsersActivity::class.java)
            startActivity(intent)
        }

        // Item "Người dùng" trên Bottom Nav
        findViewById<View>(R.id.navAdminUsers)?.setOnClickListener {
            val intent = Intent(this@AdminDashboardActivity, AdminUsersActivity::class.java)
            startActivity(intent)
        }

        // Item "Tài khoản / Thoát" trên Bottom Nav -> Quay về Login
        findViewById<View>(R.id.navAdminLogout)?.setOnClickListener {
            val intent = Intent(this@AdminDashboardActivity, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finish()
        }
    }
}

// 2. Màn hình Quản lý Danh sách Người dùng
class AdminUsersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_users)

        // Nút Back (dấu mũi tên ←)
        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            finish()
        }

        // Item "Tổng quan" trên Bottom Nav -> Chuyển về Dashboard
        findViewById<View>(R.id.navOverview)?.setOnClickListener {
            val intent = Intent(this@AdminUsersActivity, AdminDashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Item "Tài khoản / Thoát" trên Bottom Nav -> Quay về Login
        findViewById<View>(R.id.navAdminLogout)?.setOnClickListener {
            val intent = Intent(this@AdminUsersActivity, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finish()
        }
    }
}