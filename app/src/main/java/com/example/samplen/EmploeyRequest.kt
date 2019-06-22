package com.example.samplen

import com.example.samplen.Api.RetrofitClient
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import com.example.samplen.R
import com.example.samplen.model.SendRespose
import kotlinx.android.synthetic.main.activity_emploey_request.*


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



class EmploeyRequest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emploey_request)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)


        val imageButton2 = findViewById<ImageButton>(R.id.send)
        imageButton2?.setOnClickListener {


            val name = etext.text.toString().trim()
            val Phone = etext2.text.toString().trim()



            RetrofitClient.instance.sendReqoust(name, Phone,"form my phone",1)
                .enqueue(object : Callback<SendRespose> {
                    override fun onFailure(call: Call<SendRespose>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<SendRespose>, response: Response<SendRespose>) {

                        Toast.makeText(
                            applicationContext,
                            response.body()!!.msg + "Send",
                            Toast.LENGTH_LONG
                        ).show()



                    }
                })


        }



    }
}

