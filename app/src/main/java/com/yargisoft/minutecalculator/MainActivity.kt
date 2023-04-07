package com.yargisoft.minutecalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.yargisoft.minutecalculator.databinding.ActivityMainBinding
import java.time.Month
import java.util.*

class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnDatePicker.setOnClickListener {
           clickDatePicker()
        }
    }

    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month =myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{view,year,month, dayOfMonth ->
                Toast.makeText(this,"DatePicker",Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day
            ).show()
    }


}