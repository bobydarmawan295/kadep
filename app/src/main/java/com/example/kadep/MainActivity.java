package com.example.kadep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.time.chrono.JapaneseDate;

public class MainActivity extends AppCompatActivity {

    Button jadwalButton;
    Button permintaanTa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jadwalButton = findViewById(R.id.jadwal);
        jadwalButton.setOnClickListener(view -> {
            Intent loggedIn = new Intent(MainActivity.this, JadwalSeminar.class);
            startActivity(loggedIn);
        });

        permintaanTa = findViewById(R.id.permintaan);
        permintaanTa.setOnClickListener(view -> {
            Intent RequestTA = new Intent(MainActivity.this, PermintaanTA.class);
            startActivity(RequestTA);
        });
    }
}