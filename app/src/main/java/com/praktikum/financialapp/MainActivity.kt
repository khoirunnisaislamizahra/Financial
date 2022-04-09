package com.praktikum.financialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.praktikum.financialapp.home.HomeFragment
import com.praktikum.financialapp.profile.ProfileFragment
import com.praktikum.financialapp.settings.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profile)
        btnSettings = findViewById(R.id.btn_settings)

//        btnHome.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username", "khoirunnisa islami zahra")
//            startActivity(intent)
//        }

//        btnProfile.setOnClickListener {
//            val intent = Intent(this, ProfileActivity::class.java)
//            intent.putExtra("username", "jurusan sistem informasi 02")
//            startActivity(intent)
//        }

//        btnSettings.setOnClickListener {
//            val intent = Intent(this, SettingsActivity::class.java)
//            intent.putExtra("username", " nim 20.12.1539")
//            startActivity(intent)
//        }

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }

        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }

        btnSettings.setOnClickListener {
            loadFragment(SettingsFragment())
        }
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }


}