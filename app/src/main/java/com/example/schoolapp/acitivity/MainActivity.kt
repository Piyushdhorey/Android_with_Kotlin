package com.example.schoolapp.acitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.schoolapp.R
import com.example.schoolapp.databinding.ActivityMainBinding
import com.example.schoolapp.fragment.TodayFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.layoutTab.addTab(binding.layoutTab.newTab().setIcon(R.drawable.ic_today_tab).setTag("today").setText(resources.getString(R.string.today_space)))
        binding.layoutTab.addTab(binding.layoutTab.newTab().setIcon(R.drawable.ic_week_tab).setTag("schedule").setText(resources.getString(R.string.today_space)))
        binding.layoutTab.addTab(binding.layoutTab.newTab().setIcon(R.drawable.ic_checklist_tab).setTag("assignments").setText(resources.getString(R.string.today_space)))
        binding.layoutTab.addTab(binding.layoutTab.newTab().setIcon(R.drawable.ic_settings_tab).setTag("settings").setText(resources.getString(R.string.today_space)))

        replaceSelectedFragment(TodayFragment.newInstance(this@MainActivity))

    }

    fun replaceSelectedFragment(fragment: Fragment?) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.layoutTodayTab, fragment!!).addToBackStack(null).commit()
    }
}