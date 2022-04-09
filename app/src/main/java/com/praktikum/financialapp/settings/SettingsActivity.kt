package com.praktikum.financialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    private lateinit var tvHome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        tvHome = findViewById(R.id.tv_home)

        var username: String? = intent.getStringExtra("username")

        tvHome.setText(username)
    }
}