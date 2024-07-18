package com.laurens.navigationbottom

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_search

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(this@SearchActivity, MainActivity::class.java))
                    true
                }
                R.id.bottom_search -> true
                R.id.bottom_settings -> {
                    startActivity(Intent(this@SearchActivity, SettingsActivity::class.java))
                    true
                }
                R.id.bottom_profile -> {
                    startActivity(Intent(this@SearchActivity, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}