package com.example.samplen

import com.example.samplen.Api.RetrofitClient
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import com.example.samplen.Adapter.ManagerAdapter
import com.example.samplen.R
import com.example.samplen.model.Manager
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

        var managers:List<Manager>
        var myContext = this;


        RetrofitClient.instance.Managers()
            .enqueue(object : Callback<List<Manager>> {
                override fun onFailure(call: Call<List<Manager>>, t: Throwable) {

                }

                override fun onResponse(call: Call<List<Manager>>, response: Response<List<Manager>>) {
                    Log.d("managers",response.body().toString())
                    managers = response.body()!!
                    var spinnerAdpter = ManagerAdapter(managers,myContext)
                    spinner.setAdapter(spinnerAdpter)
                }
            })



        val imageButton2 = findViewById<ImageButton>(R.id.send)
        imageButton2?.setOnClickListener {


            val name = etext.text.toString().trim()
            val Phone = etext2.text.toString().trim()
            val typeOfRequest = findViewById<RadioButton>(rg.checkedRadioButtonId)

            val body =  typeOfRequest.text as String?

           val mangerID:Manager = spinner.selectedItem as Manager

            if (body != null) {
                RetrofitClient.instance.sendReqoust(name, Phone,body,mangerID.id)
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
}

