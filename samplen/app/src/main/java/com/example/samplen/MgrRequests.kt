package com.example.samplen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.samplen.Api.RetrofitClient
import com.example.samplen.model.LoginResponse
import com.example.samplen.model.MgrRequestsResponse
import kotlinx.android.synthetic.main.activity_mgr_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MgrRequests : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_requests)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)




        RetrofitClient.instance.myReqoust("1")
            .enqueue(object : Callback<MgrRequestsResponse> {
                override fun onFailure(call: Call<MgrRequestsResponse>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<MgrRequestsResponse>, response: Response<MgrRequestsResponse>) {
                    Toast.makeText(
                                applicationContext,
                        response.body()!!.toString(),
                        Toast.LENGTH_LONG
                    ).show()

                }


                }
            )

















    }
}
