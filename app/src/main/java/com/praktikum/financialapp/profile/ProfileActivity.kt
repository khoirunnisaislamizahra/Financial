package com.praktikum.financialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    private lateinit var  tvHome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        tvHome = findViewById(R.id.tv_home)

        var username: String? = intent.getStringExtra("username")

        tvHome.setText(username)
    }
}