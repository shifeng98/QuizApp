package com.example.quizapplication

import android.content.Intent
import android.os.Bundle
import android.viewbinding.library.activity.viewBinding
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.databinding.ActivityMainBinding
import com.example.quizapplication.model.QuizActivity

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.btnStart.setOnClickListener {
            if (binding.txtName.text.toString().isEmpty()){
                Toast.makeText(this,
                        "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}