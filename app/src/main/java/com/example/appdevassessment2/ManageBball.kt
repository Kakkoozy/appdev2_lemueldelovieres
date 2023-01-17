package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_managebball.*

class ManageBball : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_managebball)

        val intent= getIntent()
        val name = intent.getStringExtra("name")
        val position = intent.getStringExtra("position")
        val team = intent.getStringExtra("team")

        nametext.text="name: "+name
        positiontext.text="position: "+position
        teamtext.text="team: "+team
    }
    fun home(view: View){
        val intent= Intent(this@ManageBball, MainActivity2::class.java)
        startActivity(intent)
    }
}