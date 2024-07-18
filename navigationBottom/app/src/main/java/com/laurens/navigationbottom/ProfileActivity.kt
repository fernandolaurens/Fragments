package com.laurens.navigationbottom

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_profile

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(this@ProfileActivity, MainActivity::class.java))
                    true
                }
                R.id.bottom_search -> {
                    startActivity(Intent(this@ProfileActivity, SearchActivity::class.java))
                    true
                }
                R.id.bottom_settings -> {
                    startActivity(Intent(this@ProfileActivity, SettingsActivity::class.java))
                    true
                }
                R.id.bottom_profile -> true
                else -> false
            }
        }
    }
}