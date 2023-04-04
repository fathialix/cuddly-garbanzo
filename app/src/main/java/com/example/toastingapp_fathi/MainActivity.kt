package com.example.toastingapp_fathi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_text:TextView
    private lateinit var edt_input_data:EditText
    private lateinit var submitbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisplay)
        edt_input_data = findViewById(R.id.edtname)
        submitbutton = findViewById(R.id.btnbutton)

        submitbutton.setOnClickListener {
            Toast.makeText(this, "Faith", Toast.LENGTH_SHORT).show()
        }

    }
}