package com.example.samplen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mgr_login.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)




//        val imageButton1 = findViewById<ImageButton>(R.id.SignButton)
//        imageButton1?.setOnClickListener {
//            val intent = Intent(this, MgrLogin::class.java)
//            startActivity(intent)
//        }
//
//        val imageButton2 = findViewById<ImageButton>(R.id.EmploeyButton)
//        imageButton2?.setOnClickListener {
//            val intent = Intent(this,EmploeyRequest::class.java)
//            startActivity(intent)

        }




    }



