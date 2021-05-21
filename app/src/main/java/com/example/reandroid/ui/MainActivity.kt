package com.example.reandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reandroid.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("foo")
    }
}