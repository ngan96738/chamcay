package com.example.chamcay
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
// tv4 
class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
    }
}

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
    }
}

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
    }
}