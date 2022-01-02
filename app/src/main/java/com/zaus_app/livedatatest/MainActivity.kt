package com.zaus_app.livedatatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.zaus_app.livedatatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainActivityViewmodel: MainActivityViewmodel by viewModels()

        mainActivityViewmodel.liveDataCounter.observe(this) {
            binding.counter.text = mainActivityViewmodel.liveDataCounter.value.toString()
        }

        binding.button.setOnClickListener {
            mainActivityViewmodel.Increment()
        }
    }
}