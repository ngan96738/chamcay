package com.example.chamcay

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Nút Đăng nhập -> Mở trang chủ MainActivity
        findViewById<Button>(R.id.btnLogin)?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Chữ "Quên mật khẩu?" -> Mở trang Quên mật khẩu
        findViewById<TextView>(R.id.tvForgotPassword)?.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        // Chữ "Tạo tài khoản mới" / "Đăng ký" -> Mở trang Đăng ký
        findViewById<TextView>(R.id.tvRegister)?.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        // Khối "Đăng nhập dành cho Quản trị viên" -> Mở trang Admin
        findViewById<View>(R.id.layoutAdminLogin)?.setOnClickListener {
            startActivity(Intent(this, AdminDashboardActivity::class.java))
        }
    }
}