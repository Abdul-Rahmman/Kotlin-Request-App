package com.example.samplen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MgrLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_login)

        val imageButton = findViewById<ImageButton>(R.id.RequestButton)
        imageButton?.setOnClickListener {
            val intent = Intent(this, MgrRequests::class.java)
            startActivity(intent)
        }


    }
}
