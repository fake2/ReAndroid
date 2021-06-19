package com.example.reandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reandroid.R
import com.example.reandroid.databinding.ActivityMainBinding
import com.google.gson.Gson
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFoo.setOnClickListener {
            Timber.d("foo")
            println("bar")
        }

    }
}