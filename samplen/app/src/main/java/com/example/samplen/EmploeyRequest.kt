package com.example.samplen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class EmploeyRequest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emploey_request)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)





    }
}
