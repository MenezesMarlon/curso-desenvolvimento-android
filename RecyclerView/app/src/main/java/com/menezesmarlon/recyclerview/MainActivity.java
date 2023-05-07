package com.menezesmarlon.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.menezesmarlon.recyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

}