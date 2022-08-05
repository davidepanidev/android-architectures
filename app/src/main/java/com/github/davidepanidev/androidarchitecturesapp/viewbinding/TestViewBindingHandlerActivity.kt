package com.github.davidepanidev.androidarchitecturesapp.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.davidepanidev.androidarchitecturesapp.databinding.ActivityTestViewBindingHandlerBinding

class TestViewBindingHandlerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestViewBindingHandlerBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestViewBindingHandlerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}