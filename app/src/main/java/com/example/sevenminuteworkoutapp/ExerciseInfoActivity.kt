package com.example.sevenminuteworkoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.sevenminuteworkoutapp.databinding.ActivityExerciseInfoBinding
import com.example.sevenminuteworkoutapp.databinding.LungesImageFragmentBinding

class ExerciseInfoActivity : AppCompatActivity() {

    private var binding: ActivityExerciseInfoBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityExerciseInfoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        binding?.sevenMinuteExercise?.setOnClickListener{
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}