package com.menezesmarlon.componentesbasicosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.menezesmarlon.componentesbasicosinterface.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initializeViews();
    }

    private void initializeViews() {
        binding.buttonSend.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                updateInfo();
            }
        });
    }

    private void updateInfo() {
        String name = binding.editName.getText().toString();
        String email = binding.editEmail.getText().toString();

        if (TextUtils.isEmpty(name)) {
            binding.editName.setError("Por favor, insira um nome");
            return;
        }

        if (TextUtils.isEmpty(email)) {
            binding.editEmail.setError("Por favor, insira um email");
            return;
        }


        binding.textName.setText(name);
        binding.textEmail.setText(email);
    }
}
