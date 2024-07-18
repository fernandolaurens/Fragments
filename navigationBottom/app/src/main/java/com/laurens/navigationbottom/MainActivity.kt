package com.laurens.navigationbottom

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {

                R.id.bottom_search -> {
                    startActivity(Intent(this@MainActivity, SearchActivity::class.java))
                    true
                }
                R.id.bottom_settings -> {
                    startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
                    true
                }
                R.id.bottom_profile -> {
                    startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}