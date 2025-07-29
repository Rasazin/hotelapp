package com.menglang.hotelapp.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.menglang.hotelapp.R;
import com.menglang.hotelapp.data.remote.models.response.LoginResponse;
import com.menglang.hotelapp.data.remote.repository.AuthRepository;
import com.menglang.hotelapp.data.remote.repository.LoginCallback;

public class MainActivity extends AppCompatActivity {

    private AuthRepository authRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        authRepository = new AuthRepository();
        authRepository.login("dinsarenkh33", "123456", new LoginCallback() {
            @Override
            public void onLoading() {
                showMessage("Loading...");
            }

            @Override
            public void onSuccess(LoginResponse response) {
                showMessage("Login Success");
            }

            @Override
            public void onError(String message) {
                showMessage(message);
            }
        });
    }
    private void showMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}