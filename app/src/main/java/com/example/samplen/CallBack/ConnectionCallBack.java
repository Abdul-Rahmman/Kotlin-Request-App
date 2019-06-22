package com.example.samplen.CallBack;

import android.util.Log;
import com.example.samplen.model.Message;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConnectionCallBack implements Callback<Message> {
    @Override
    public void onResponse(Call<Message> call, Response<Message> response) {
        if(response.isSuccessful()){
            Log.d("Connection Status",response.message());
        }
    }

    @Override
    public void onFailure(Call<Message> call, Throwable t) {

    }
}
