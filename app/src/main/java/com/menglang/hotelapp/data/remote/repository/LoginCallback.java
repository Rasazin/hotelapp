package com.menglang.hotelapp.data.remote.repository;

import com.menglang.hotelapp.data.remote.models.response.LoginResponse;

public interface LoginCallback {
    void onLoading();
    void onSuccess(LoginResponse response);
    void onError(String message);
}
