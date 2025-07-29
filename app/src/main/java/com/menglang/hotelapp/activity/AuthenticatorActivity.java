package com.menglang.hotelapp.activity;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.menglang.hotelapp.data.local.UserLocalData;

public class AuthenticatorActivity extends AppCompatActivity {
    protected void onResume(){
        super.onResume();
        if (UserLocalData.setAccessToken(this).isEmpty()){
            Intent intent = new Intent(AuthenticatorActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
