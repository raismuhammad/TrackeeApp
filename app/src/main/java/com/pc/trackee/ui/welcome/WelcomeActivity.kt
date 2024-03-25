package com.pc.trackee.ui.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pc.trackee.R
import com.pc.trackee.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}