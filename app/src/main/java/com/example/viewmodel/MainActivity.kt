package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //use viewModel without factory
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = viewModel.getCount().toString()
        binding.button.setOnClickListener {
            viewModel.incrementCount()
        }

        viewModel.count.observe(this
        ) { binding.textView.text = viewModel.count.value.toString() }

    }

}