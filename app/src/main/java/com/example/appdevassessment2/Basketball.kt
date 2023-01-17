package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_basketball.*

class Basketball : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basketball)
    }


    fun register(view: View) {
        val name = Input1.text.toString()
        val position = Input2.text.toString()
        val team = Input3.text.toString()

        val intent = Intent(this@Basketball, ManageBball::class.java)


        intent.putExtra("name", name)
        intent.putExtra("position", position)
        intent.putExtra("team", team)
        startActivity(intent)
    }
}