package com.example.samplen;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit;
    private static ServiceFace serviceFace;
    private static OkHttpClient okHttpClient;

    private APIClient() {
    }

    private static Retrofit getRetrofit(){
        if(retrofit !=null){
            return retrofit;
        }
        setClient();

        return retrofit = new Retrofit
                .Builder()
                .client(okHttpClient)
                .baseUrl(Config.getURL())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }

    private static void setClient(){
        if(okHttpClient !=null){
            return;
        }

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        okHttpClient= new OkHttpClient.Builder()
                .connectTimeout(Config.getTIMEOUT(), Config.getTIMEOUTUNIT())
                .addInterceptor(loggingInterceptor)
                .build();
    }



    public static ServiceFace getServiceFace(){
        return getRetrofit().create(ServiceFace.class);
    }
}


