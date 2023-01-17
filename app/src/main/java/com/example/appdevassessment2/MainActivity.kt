package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun savebutton(view: View) {
        val name=Username.text.toString()

        val intent = Intent(this@MainActivity,MainActivity2::class.java)
        intent.putExtra("username", name)
        startActivity(intent)

    }
}