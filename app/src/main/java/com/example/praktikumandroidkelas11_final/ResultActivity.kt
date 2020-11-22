package com.example.praktikumandroidkelas11_final

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_ID = "id_student"
        const val EXTRA_NAME = "name_student"
        const val EXTRA_PHONE_NUMBER = "phone_number_student"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvIdResult = findViewById<TextView>(R.id.tvIdResult)
        val tvNamResult = findViewById<TextView>(R.id.tvNameResult)
        val tvPhoneNumberResult = findViewById<TextView>(R.id.tvPhoneNumberResult)

        val id = intent.getStringExtra(EXTRA_ID)
        val name = intent.getStringExtra(EXTRA_NAME)
        val phoneNumber = intent.getStringExtra(EXTRA_PHONE_NUMBER)

        tvIdResult.text = id
        tvNamResult.text = name
        tvPhoneNumberResult.text = phoneNumber
    }
}