package com.example.kadep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kadep.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean isLoggedIn = false;
    Button jadwalButton, mintaSidangButton, jadwalSeminar, mintaSeminar, mahasiswaTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent mainIntent = getIntent();
        String username = mainIntent.getStringExtra("USERNAME");
        isLoggedIn = mainIntent.getBooleanExtra("IS_LOGGED_IN", false);

        if(!isLoggedIn){
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        binding.nama.setText(username);


        jadwalButton = findViewById(R.id.jadwalSidang);
        jadwalButton.setOnClickListener(views -> {
            Intent jadwalSidang = new Intent(MainActivity.this, JadwalSidang.class);
            startActivity(jadwalSidang);
        });

        mintaSidangButton = findViewById(R.id.mintaSidang);
        mintaSidangButton.setOnClickListener(views -> {
            Intent mintaSidang = new Intent(MainActivity.this, PermintaanSidang.class);
            startActivity(mintaSidang);
        });

        jadwalSeminar = findViewById(R.id.button4);
        jadwalSeminar.setOnClickListener(views -> {
            Intent mintaSeminar = new Intent(MainActivity.this, JadwalSeminar.class);
            startActivity(mintaSeminar);
        });

        mintaSeminar = findViewById(R.id.button5);
        mintaSeminar.setOnClickListener(views -> {
            Intent mintaSeminar = new Intent(MainActivity.this, PermintaanSeminar.class);
            startActivity(mintaSeminar);
        });
        
    }
}