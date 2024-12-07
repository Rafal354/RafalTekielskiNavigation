package com.example.rafaltekielskinavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rafaltekielskinavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setNavToSecBtnOnClickListener()
    }

//    private fun setNavToSecBtnOnClickListener() {
//        binding.navToSecActivityBtn.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        }
//    }
}