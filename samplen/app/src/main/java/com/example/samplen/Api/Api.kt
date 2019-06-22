
package com.example.samplen.Api;
import com.example.samplen.model.LoginResponse
import com.example.samplen.model.MgrRequestsResponse
import com.example.samplen.model.SendRespose
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {


    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>



    @FormUrlEncoded
    @POST("MyRequest")
    fun myReqoust(
        @Field("id") id:String
    ):Call<MgrRequestsResponse>


    @FormUrlEncoded
    @POST("Request")
    fun sendReqoust(
        @Field("name") name:String,
        @Field("email") phone: String,
        @Field("body") body: String,
        @Field("Managers_id") id: Int
    ):Call<SendRespose>

}
