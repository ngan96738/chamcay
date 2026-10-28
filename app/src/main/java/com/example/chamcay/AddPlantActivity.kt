package com.example.chamcay // ⚠️ THAY BẰNG PACKAGE CHÍNH XÁC TRONG DỰ ÁN CỦA BẠN

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chamcay.databinding.ActivityAddPlantBinding // ⚠️ THAY com.example.chamcay BẰNG PACKAGE CỦA BẠN
import java.util.Calendar
import java.util.Locale

class AddPlantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPlantBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPlantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Khởi tạo các Spinner
        setupPlantTypeSpinner()
        setupLightConditionSpinner()

        // Sự kiện chọn ngày trồng
        binding.btnDatePicker.setOnClickListener {
            showDatePicker()
        }

        // Sự kiện đóng / quay lại
        binding.btnBack.setOnClickListener { finish() }
        binding.btnClose.setOnClickListener { finish() }
        binding.btnCancel.setOnClickListener { finish() }

        // Sự kiện lưu cây
        binding.btnSavePlant.setOnClickListener {
            savePlantData()
        }
    }

    private fun setupPlantTypeSpinner() {
        val plantTypes: Array<String> = resources.getStringArray(R.array.plant_types)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, plantTypes)
        binding.spinnerPlantType.adapter = adapter
    }

    private fun setupLightConditionSpinner() {
        val lightConditions: Array<String> = resources.getStringArray(R.array.light_conditions)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lightConditions)
        binding.spinnerLightCondition.adapter = adapter
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                // Khắc phục cảnh báo Locale mặc định bằng Locale.getDefault()
                val formattedDate = String.format(Locale.getDefault(), "%02d/%02d/%d", selectedDay, selectedMonth + 1, selectedYear)
                binding.etPlantDate.setText(formattedDate)
            },
            year, month, day
        )
        datePickerDialog.show()
    }

    private fun savePlantData() {
        val name = binding.etPlantName.text.toString().trim()
        val type = binding.spinnerPlantType.selectedItem.toString()
        val date = binding.etPlantDate.text.toString().trim()
        val location = binding.etLocation.text.toString().trim()
        val light = binding.spinnerLightCondition.selectedItem.toString()
        val note = binding.etNote.text.toString().trim()

        if (name.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên cây!", Toast.LENGTH_SHORT).show()
            return
        }

        // Sử dụng các biến để tránh cảnh báo Unused variable
        Toast.makeText(this, "Đã thêm cây $name ($type) tại $location!", Toast.LENGTH_SHORT).show()
        finish()
    }
}