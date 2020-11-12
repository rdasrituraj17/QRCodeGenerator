package com.example.qrcodegenerator

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class AppActivity : Activity() {
    var button: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        addListenerOnButton()
    }

    fun addListenerOnButton() {
        val context1: Context = this
        button = findViewById<View>(R.id.scan) as Button
        button!!.setOnClickListener {
            val intent = Intent(context1, App2Activity::class.java)
            startActivity(intent)
        }
        val context: Context = this
        button = findViewById<View>(R.id.gen) as Button
        button!!.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }
}