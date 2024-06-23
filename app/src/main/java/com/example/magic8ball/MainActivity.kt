package com.example.magic8ball

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.magic8ball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.randBall.setOnClickListener{
        binding.randBall.text = getRandText()
    }
    }
    fun getRandText():String {
        return resources.getStringArray(R.array.ball)[randomNumb()]
    }
    fun randomNumb(): Int{
        val size =  resources.getStringArray(R.array.ball).size-1
        return (0..size).random()
    }
}