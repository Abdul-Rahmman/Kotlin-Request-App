package com.example.samplen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import com.example.samplen.CallBack.ConnectionCallBack
import com.example.samplen.model.Message
import kotlinx.android.synthetic.main.activity_mgr_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() , Callback<Message> {
    override fun onFailure(call: Call<Message>, t: Throwable) {
        Log.d("Connection Status", t.message)
    }

    override fun onResponse(call: Call<Message>, response: Response<Message>) {
        Log.d("Connection Status", response.message())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        Connector.getServiceFace()
            .verifyConnection()
            .enqueue(this);


        val imageButton1 = findViewById<ImageButton>(R.id.SignButton)
        imageButton1?.setOnClickListener {
            val intent = Intent(this, MgrLogin::class.java)
            startActivity(intent)
        }

        val imageButton2 = findViewById<ImageButton>(R.id.EmploeyButton)
        imageButton2?.setOnClickListener {
            val intent = Intent(this, EmploeyRequest::class.java)
            startActivity(intent)

        }


    }
}


