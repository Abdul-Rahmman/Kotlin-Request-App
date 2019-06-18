package com.example.samplen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton

class MgrLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_login)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)


        val imageButton = findViewById<ImageButton>(R.id.RequestButton)
        imageButton?.setOnClickListener {
            val intent = Intent(this, MgrRequests::class.java)
            startActivity(intent)
        }

    }
}

// run your app  ok   thanks alot    wtf with all of these codes it worked on my phone

