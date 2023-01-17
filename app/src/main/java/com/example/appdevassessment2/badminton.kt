package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_badminton.*


class badminton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_badminton)
    }
    fun register(view: View) {
        val name = nameinput.text.toString()
        val position = positioninput.text.toString()
        val team = teaminput.text.toString()

        val intent = Intent(this@badminton, Managebton::class.java)


        intent.putExtra("name", name)
        intent.putExtra("category", position)
        intent.putExtra("team", team)
        startActivity(intent)
    }
}