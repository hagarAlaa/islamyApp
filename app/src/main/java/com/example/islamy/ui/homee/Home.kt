package com.example.islamy.ui.homee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islamy.R
import com.example.islamy.ui.homee.fragments.Hadith
import com.example.islamy.ui.homee.fragments.Quran
import com.example.islamy.ui.homee.fragments.Radio
import com.example.islamy.ui.homee.fragments.Tasbeh
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class Home : AppCompatActivity() {
    lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener
        { menuite ->
            if (menuite.itemId == R.id.radio) {
                pushFragment(Radio())


            } else if (menuite.itemId == R.id.hadith) {
                pushFragment(Hadith())
            } else if (menuite.itemId == R.id.sebha) {
                pushFragment(Tasbeh())

            } else {
                pushFragment(Quran())
            }
            return@OnItemSelectedListener true;
        })
        bottomNavigation.selectedItemId = R.id.quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}