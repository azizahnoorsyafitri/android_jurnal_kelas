package com.app.jurnalkelas.util.api;

import com.app.jurnalkelas.ui.guru.GuruModelList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BaseApiService {

    @FormUrlEncoded
    @POST("login")
    Call<ResponseBody> login(@Field("username") String username,
                             @Field("password") String password);

    @FormUrlEncoded
    @POST("send_tokenid")
    Call<ResponseBody> sendTokenId(
            @Field("user_level") String user_level,
            @Field("user_id") int user_id,
            @Field("token_id") String token_id);

    @GET("get_guru")
    Call<GuruModelList> getGuru();


}