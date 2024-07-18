package com.laurens.navigationbottom

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_settings

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(this@SettingsActivity, MainActivity::class.java))
                    finish()
                    true
                }
                R.id.bottom_search -> {
                    startActivity(Intent(this@SettingsActivity, SearchActivity::class.java))
                    finish()
                    true
                }
                R.id.bottom_profile -> {
                    startActivity(Intent(this@SettingsActivity, ProfileActivity::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}