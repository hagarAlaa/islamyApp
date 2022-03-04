package com.example.islamy.ui.suraDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.islamy.Constant
import com.example.islamy.R

class SuraDetails : AppCompatActivity() {
    lateinit var titleTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        titleTextView = findViewById(R.id.sura_name)
        val suraname: String = intent.getStringExtra(Constant.ESTRA_SURA_NAME)!!
        val position: Int = intent.getIntExtra(Constant.ESTRA_SURA_POSITION, -4)
        titleTextView.setText(suraname)


    }
}