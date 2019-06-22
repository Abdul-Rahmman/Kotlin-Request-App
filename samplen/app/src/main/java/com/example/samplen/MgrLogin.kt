package com.example.samplen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import com.example.samplen.Api.RetrofitClient

import com.example.samplen.model.LoginResponse
import kotlinx.android.synthetic.main.activity_mgr_login.*


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


class MgrLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_login)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        val imageButton = findViewById<ImageButton>(R.id.RequestButton)
        imageButton?.setOnClickListener {
             val intent = Intent(this, MgrRequests::class.java)
            startActivity(intent)

//
//            val email = Emailtxt.text.toString().trim()
//            val password = Passtxt.text.toString().trim()
//
//
//
//            RetrofitClient.instance.userLogin(email, password)
//                .enqueue(object : Callback<LoginResponse> {
//                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//
//                        if (response.body()!!.States == "Good") {
//
//                            Toast.makeText(applicationContext, response.body()!!.States + "you can go", Toast.LENGTH_LONG).show()
//
//                        } else {
//
//                            Toast.makeText(applicationContext, response.body()!!.States + "Nooooooooooo♦", Toast.LENGTH_LONG).show()
//
//
//                        }
//
//
//                    }
//                })


        }

    }
}



