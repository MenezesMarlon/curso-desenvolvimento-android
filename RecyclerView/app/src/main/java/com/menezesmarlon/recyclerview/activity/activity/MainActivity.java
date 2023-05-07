package com.menezesmarlon.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.menezesmarlon.recyclerview.activity.adapter.Adapter;
import com.menezesmarlon.recyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        configurarReciclerView();
        configurarAdapter();
    }
    public void configurarAdapter(){
        Adapter adapter = new Adapter();
    }
    public void configurarReciclerView(){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recyclerView.setLayoutManager( layoutManager );
        binding.recyclerView.setHasFixedSize(true);
    }
}