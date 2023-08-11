package com.example.agetominutecalculator

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private var tvSelectedDate: TextView? = null
    private var tvAgeinMinutes: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePickerBtn: Button = findViewById(R.id.datePickerBtn)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeinMinutes = findViewById(R.id.tvAgeinMinutes)

        datePickerBtn.setOnClickListener {
            clickDatePicker()
        }
    }

    private fun clickDatePicker() {

        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{ _, year, month, dayOfMonth -> Toast.makeText(this,
                "Year $year, Month ${month+1}, Day $dayOfMonth", Toast.LENGTH_LONG).show()

                val selectedDate = "$dayOfMonth-${month+1}-$year"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)

                val theDate = sdf.parse((selectedDate))

                theDate?.let {
                    val selectedDateInMinutes = theDate.time / 60000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                    currentDate?.let {
                        val currentDateInMinutes = currentDate.time / 60000

                        val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes

                        tvAgeinMinutes?.text = differenceInMinutes.toString()
                    }

                }
            }, year, month, day)

        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()

    }
}