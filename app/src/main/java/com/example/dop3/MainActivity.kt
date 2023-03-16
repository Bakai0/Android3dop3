package com.example.dop3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputBinding
import androidx.lifecycle.ViewModelProvider
import com.example.dop3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(binding.root)
        setupObserve()
        initialize()
    }

    private fun initialize() {
        binding.btn.setOnClickListener {
            viewModel?.random()
        }
    }

    private fun setupObserve() {
        viewModel?.random()?.observe(this) {
            binding.txt.text = it.toString()

        }
    }
}