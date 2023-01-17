package com.example.appdevassessment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val intent =getIntent()
        val name= intent.getStringExtra("username")
        Welcoming.text="Hello,"+name
    }
    fun sportchoose(view: View) {

        val intent= Intent(this@MainActivity2, SportCategory::class.java)
        startActivity(intent)
    }
    fun choosemanage(view: View) {

        val intent= Intent(this@MainActivity2, eventcategory::class.java)
        startActivity(intent)
    }


}