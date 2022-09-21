package com.example.kadep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(view -> {
            Intent loggedIn = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(loggedIn);
        });
    }

}