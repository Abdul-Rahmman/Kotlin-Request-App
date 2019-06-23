package com.example.samplen

import android.content.Intent
import com.example.samplen.Api.RetrofitClient
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.Toast
import com.example.samplen.Adapter.CustomAdapter

import com.example.samplen.model.MgrRequestsResponse
import com.example.samplen.model.Request


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import kotlin.math.log


class MgrRequests : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgr_requests)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var myintent = intent

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        var id = myintent.getIntExtra("id",-1)

        RetrofitClient.instance.myReqoust(id.toString())
            .enqueue(object : Callback<ArrayList<Request>> {
                override fun onFailure(call: Call<ArrayList<Request>>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<ArrayList<Request>>, response: Response<ArrayList<Request>>) {

                    val adapter = CustomAdapter( response.body()!!)
                    recyclerView.adapter = adapter



                }


            }
            )

    }
}