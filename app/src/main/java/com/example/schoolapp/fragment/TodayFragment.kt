package com.example.schoolapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.schoolapp.R
import com.example.schoolapp.acitivity.MainActivity
import com.example.schoolapp.databinding.FragmentTodayBinding

class TodayFragment : Fragment() {

    lateinit var binding: FragmentTodayBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTodayBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {

        fun newInstance(mainActivityInstance: MainActivity) =
            TodayFragment().apply {
                arguments = Bundle().apply {
                    mainActivity = mainActivityInstance
                }
            }

    }
}