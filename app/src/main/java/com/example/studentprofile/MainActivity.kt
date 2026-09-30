package com.example.studentprofile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fullName = findViewById<EditText>(R.id.etFullName)
        val email = findViewById<EditText>(R.id.etEmail)

        val courseNews = findViewById<CheckBox>(R.id.cbCourseNews)
        val examReminders = findViewById<CheckBox>(R.id.cbExamReminders)

        val availability =
            findViewById<ToggleButton>(R.id.toggleAvailability)

        val bachelor =
            findViewById<RadioButton>(R.id.rbBachelor)

        val master =
            findViewById<RadioButton>(R.id.rbMaster)

        val postgraduate =
            findViewById<RadioButton>(R.id.rbPostgraduate)

        val saveButton =
            findViewById<Button>(R.id.btnSave)

        val resultText =
            findViewById<TextView>(R.id.tvResult)

        val helpButton =
            findViewById<Button>(R.id.btnHelp)

        courseNews.isChecked = true
        examReminders.isChecked = false
        availability.isChecked = false

        bachelor.isChecked = true
        master.isChecked = false
        postgraduate.isChecked = false

        saveButton.isEnabled = true

        saveButton.setOnClickListener {

            val name = fullName.text.toString()
            val userEmail = email.text.toString()

            resultText.text =
                "Ուսանող՝ $name, էլ․ փոստ՝ $userEmail"
        }

        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
    }
}