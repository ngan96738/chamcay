package com.example.chamcay
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AddGrowthImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_growth_image)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
    }
}

class ChangeInformationPlantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_information_plant)
        findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
        findViewById<View>(R.id.btnClose)?.setOnClickListener { finish() }
        findViewById<View>(R.id.btnCancel)?.setOnClickListener { finish() }
    }
}