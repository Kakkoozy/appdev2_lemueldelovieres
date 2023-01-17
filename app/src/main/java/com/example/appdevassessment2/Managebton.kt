package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_managebball.*
import kotlinx.android.synthetic.main.activity_managebton.*

class Managebton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_managebton)
        val intent= getIntent()
        val name = intent.getStringExtra("name")
        val cat = intent.getStringExtra("category")
        val team = intent.getStringExtra("team")

        name1.text="name: "+name
        category.text="Category: "+cat
        team1.text="team: "+team
    }
    fun home(view: View) {
        val intent = Intent(this@Managebton, MainActivity2::class.java)
        startActivity(intent)
    }
}