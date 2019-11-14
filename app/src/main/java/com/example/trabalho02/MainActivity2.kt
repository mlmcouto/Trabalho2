package com.example.trabalho02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Button1MainAc2 =findViewById<Button>(R.id.button1_AcMain2)
        val Button2MainAc2 = findViewById<Button>(R.id.button2_AcMain2)
        val edittext1ACM2 = findViewById<EditText>(R.id.ActM2editText1)


        Button1MainAc2.setOnClickListener {
            finish()
        }

        Button2MainAc2.setOnClickListener {
            val text1= edittext1ACM2.text.toString()
            val intent = Intent (this, MainRecycler::class.java)
            intent.putExtra("name_1", text1)
            startActivity(intent)
        }

    }
}
