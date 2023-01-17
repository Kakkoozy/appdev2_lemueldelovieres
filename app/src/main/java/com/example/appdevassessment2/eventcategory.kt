package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_eventcategory.*

class eventcategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventcategory)
    }
    fun ball (view: View) {

        val intent= Intent(this@eventcategory, ManageBball::class.java)
        startActivity(intent)
    }
    fun bton (view: View)
    {
        val intent = Intent(this@eventcategory, Managebton::class.java)
        startActivity(intent)
    }
    fun main (view: View)
    {
        val intent =Intent(this@eventcategory, MainActivity2::class.java)
        startActivity(intent)
    }
}