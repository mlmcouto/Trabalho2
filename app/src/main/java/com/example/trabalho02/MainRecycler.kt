package com.example.trabalho02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainRecycler : AppCompatActivity() {

    private lateinit var var_recycler: RecyclerView
    private lateinit var var_adapter: Myadapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        var_recycler = findViewById<RecyclerView>(R.id.reclycler_activitymain)
        var_recycler.layoutManager = LinearLayoutManager(this)
        var_adapter=Myadapter(mutableListOf<Class_User>())
        var_recycler.adapter=(var_adapter)

/*      val text_1 = findViewById<TextView>(R.id.ActM2editText1)
        text_1.text = intent.getStringExtra("name_1")*/


        val Add_Button = findViewById<FloatingActionButton>(R.id.reclycler_view_layout_fab)
        Add_Button.setOnClickListener{

            val user = Class_User("name_1")
            var_adapter.addUser(user)
        }
    }
}




