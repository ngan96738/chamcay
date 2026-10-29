package com.example.chamcay
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AiCareInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_care_input)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }

        // Nút Tư vấn AI sẽ mở Result
        findViewById<View>(R.id.btnAiConsult)?.setOnClickListener {
            startActivity(Intent(this, AiResultActivity::class.java))
        }
    }
}