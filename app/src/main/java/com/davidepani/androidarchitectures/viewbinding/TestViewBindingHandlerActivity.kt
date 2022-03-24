package com.davidepani.androidarchitectures.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davidepani.androidarchitectures.databinding.ActivityTestViewBindingHandlerBinding

class TestViewBindingHandlerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestViewBindingHandlerBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestViewBindingHandlerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}