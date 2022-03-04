package com.example.islamy.ui.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.islamy.R
import com.example.islamy.ui.homee.Home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            startHome();
        }, 3000);
    }

    fun startHome() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
        finish()
    }
}