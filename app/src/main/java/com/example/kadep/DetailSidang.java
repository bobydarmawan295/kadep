package com.example.kadep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailSidang extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sidang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

    }
}