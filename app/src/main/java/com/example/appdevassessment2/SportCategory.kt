package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_sport_category.*

class SportCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_category)
    }

    fun ball (view: View) {
        val intent= Intent(this@SportCategory, Basketball::class.java)
        startActivity(intent)
    }
    fun Home (view: View){
        val homepage = Intent(this@SportCategory,MainActivity2::class.java)
        startActivity(homepage)
    }
    fun badminton(view: View) {
        val homepage = Intent(this@SportCategory, badminton::class.java)
        startActivity(homepage)
    }
}