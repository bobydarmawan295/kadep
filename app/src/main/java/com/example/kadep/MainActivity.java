package com.example.kadep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private boolean isLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mainIntent = getIntent();
        String username = mainIntent.getStringExtra("USERNAME");
        isLoggedIn = mainIntent.getBooleanExtra("IS_LOGGED_IN", false);

        if(!isLoggedIn){
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        mainIntent.setText("Hello, " + username);

    }
}