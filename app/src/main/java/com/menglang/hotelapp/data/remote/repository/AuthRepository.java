package com.menglang.hotelapp.data.remote.repository;

import com.menglang.hotelapp.data.network.ApiClient;
import com.menglang.hotelapp.data.network.ApiNetwork;
import com.menglang.hotelapp.data.remote.models.request.LoginRequest;
import com.menglang.hotelapp.data.remote.models.response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthRepository {
    private final ApiNetwork apiNetwork;
    public AuthRepository(){
        apiNetwork = ApiClient.getClient().create(ApiNetwork.class);
    }
    public void login(String username, String password, LoginCallback loginCallback){
        try {
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setPhoneNumber(username);
            loginRequest.setPassword(password);
            loginCallback.onLoading();
            apiNetwork.login(loginRequest).enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        loginCallback.onSuccess(response.body());
                    } else {
                        loginCallback.onError("Your username and password incorrect");
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    loginCallback.onError("General error" + t.getMessage());
                }
            });
        }catch (Throwable e){
            loginCallback.onError(e.getMessage());
        }
    }
}
