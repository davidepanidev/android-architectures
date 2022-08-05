package io.github.davidepanidev.androidarchitecturesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.davidepanidev.androidarchitecturesapp.databinding.ActivityMainBinding
import io.github.davidepanidev.androidarchitecturesapp.viewbinding.TestViewBindingHandlerActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        with (binding) {
            btViewBinding.setOnClickListener { goToViewBindingSection() }
        }
    }

    private fun goToViewBindingSection() {
        val intent = Intent(this, TestViewBindingHandlerActivity::class.java)
        startActivity(intent)
    }

}