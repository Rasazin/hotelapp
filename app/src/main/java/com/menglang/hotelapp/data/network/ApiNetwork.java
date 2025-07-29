package com.menglang.hotelapp.data.network;

import com.menglang.hotelapp.data.remote.models.request.LoginRequest;
import com.menglang.hotelapp.data.remote.models.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiNetwork {
    @POST("/api/oauth/token")
    Call<LoginResponse> login(@Body LoginRequest req);
}
