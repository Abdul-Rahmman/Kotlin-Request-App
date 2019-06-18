package com.example.samplen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class MgrRequests : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_requests)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)


    }
}
