package com.example.islamy.ui.homee.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.islamy.R

class Tasbeh : Fragment() {
    var count: Int = 0
    lateinit var counter: Button
    lateinit var zeker: Button
    lateinit var mode: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tasbeh, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        counter = view.findViewById(R.id.tasbeh_counter)
        zeker = view.findViewById(R.id.zeker_name)
        zeker.setOnClickListener(
            View.OnClickListener {
                count++;
                counter.text = count.toString()
            }
        )
        mode = view.findViewById(R.id.mode)
        mode.setOnClickListener(View.OnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        })
    }

}