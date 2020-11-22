package com.example.praktikumandroidkelas11_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btLogin = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener {
            val stEmail = etEmail.text.toString().trim()
            val stPassword = etPassword.text.toString()
            Toast.makeText(this,stEmail,Toast.LENGTH_LONG).show()
        }

    }
}