package com.example.qrcodegenerator

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var button: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnButton()
    }
    fun addListenerOnButton() {
        val context1: Context = this
        button = findViewById<View>(R.id.scan) as Button
        button!!.setOnClickListener {
            val intent = Intent(context1, Scan::class.java)
            startActivity(intent)
        }
        val context: Context = this
        button = findViewById<View>(R.id.gen) as Button
        button!!.setOnClickListener {
            val intent = Intent(context, Generate::class.java)
            startActivity(intent)
        }
    }
}