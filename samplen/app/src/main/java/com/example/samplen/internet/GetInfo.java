package com.example.samplen.internet;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface GetInfo {


    @GET("login")
    Call<User>Log1(@Query("userName") String name,
                           @Query("password") String pass);

    @FormUrlEncoded
    @POST("Register")
    Call<User>Logs(@Field("userName") String name,
                    @Field("password") String pass);

    @GET("getLogIN")
    Call<Masge>GetLogIN(@Query("name") String name,
                        @Query("pass") String pass);
//
//    @GET("goLogIN")
//    Call<List<User>>GetLogINz(@Query("name") String name,
//                              @Query("pass") String pass);
//
///*
//    @FormUrlEncoded
//    @GET("enterNot")
//    Call<Masge>AddNote(@Query("titel") String titel,
//                                    @Query("note") String note,
//                                          @Query("user_id") String user_id );
//*/
//
//
//    @FormUrlEncoded
//    @POST("enterNot")
//    Call<Masge>AddNote(@Field("titel") String titel,
//                       @Field("note") String note,
//                       @Field("user_id") String user_id );
//
//
//    @GET("getAllNot")
//    Call<List<note>>getAllNot(@Query("id")String ueserID);
//
//
//    @GET("update")
//    Call<Masge>updatePost(@Query("titel") String titel,
//                          @Query("note") String note,
//                          @Query("id") int id );
//
//
//    @GET("delte")
//    Call<Masge>deletePost(@Query("id") int id );
//
//
//


}
