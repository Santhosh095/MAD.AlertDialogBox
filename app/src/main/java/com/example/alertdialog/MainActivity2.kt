package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val etMessage:EditText = findViewById(R.id.msg)
        val btDisplay:Button = findViewById(R.id.send_btn)

        btDisplay.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD Lab")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "You clicked OK",
                        Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Cancel") { _, _ ->
                    Toast.makeText(applicationContext, "You clicked Cancel",
                        Toast.LENGTH_LONG).show()
                }
                .create()
            alertDialog.show()
        }
    }
}