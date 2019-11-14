package com.example.trabalho02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Button1MainAc3 =findViewById<Button>(R.id.button1_AcMain3)
        val Button2MainAc3 = findViewById<Button>(R.id.button2_AcMain3)
        val edittext1ACM3 = findViewById<EditText>(R.id.ActM3editText1)
        val edittext2ACM3 = findViewById<EditText>(R.id.ActM3editText2)
        val edittext3ACM3=findViewById<EditText>(R.id.ActM3editText3)
        val edittext4ACM3=findViewById<EditText>(R.id.ActM3editText4)

        Button1MainAc3.setOnClickListener {
            finish()
        }

        Button2MainAc3.setOnClickListener {
            val text1= edittext1ACM3.text.toString()
            val text2= edittext2ACM3.text.toString()
            val text3= edittext3ACM3.text.toString()
            val text4= edittext4ACM3.text.toString()
            val intent = Intent (this, MainActivity4::class.java)

            intent.putExtra("name1", text1)
            intent.putExtra("name2", text2)
            intent.putExtra("name3", text3)
            intent.putExtra("name4", text4)

            startActivity(intent)
        }
    }
}
