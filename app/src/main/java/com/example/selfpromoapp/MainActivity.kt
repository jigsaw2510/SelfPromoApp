package com.example.selfpromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    var contactNameEditText: TextInputEditText? = null
    var contactNumberEditText: TextInputEditText? = null
    var myDisplayNameEditText: TextInputEditText? = null
    var startDateEditText: TextInputEditText? = null
    var juniorCheckBox: TextInputEditText? = null
    var immediateStartCheckBox: TextInputEditText? = null
    var jobTitleSpinner: TextInputEditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactNameEditText = findViewById(R.id.edit_text_contact_name)
        contactNumberEditText = findViewById(R.id.edit_text_contact_number)
        myDisplayNameEditText = findViewById(R.id.edit_text_my_display_name)
        startDateEditText = findViewById(R.id.edit_text_start_date)
        juniorCheckBox = findViewById(R.id.check_box_junior)
        immediateStartCheckBox = findViewById(R.id.check_box_immediate_start)
        jobTitleSpinner = findViewById(R.id.spinner_job_title)


        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {
            onPreviewClicked()

        }
    }

    private fun onPreviewClicked() {
        val testString = contactNameEditText!!.text.toString() + ", " + contactNumberEditText!!.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }
}