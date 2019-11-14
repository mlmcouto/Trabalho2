package com.example.trabalho02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val Button1MainAc4 =findViewById<Button>(R.id.button1_AcMain4)

        Button1MainAc4.setOnClickListener {
            finish()
        }

        val text_1 = findViewById<TextView>(R.id.activity4_text1)
        val text_2 =findViewById<TextView>(R.id.activity4_text2)
        val text_3 =findViewById<TextView>(R.id.activity4_text3)
        val text_4 =findViewById<TextView>(R.id.activity4_text4)

        text_1.text = intent.getStringExtra("name1")
        text_2.text = intent.getStringExtra("name2")
        text_3.text = intent.getStringExtra("name3")
        text_4.text = intent.getStringExtra("name4")

    }



}
