package com.menezesmarlon.componentesbasicosinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

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
            binding.editName.setError("Please enter a name");
            return;
        }

        if (TextUtils.isEmpty(email)) {
            binding.editEmail.setError("Please enter an email address");
            return;
        }
        

        binding.textName.setText(name);
        binding.textEmail.setText(email);
    }
}
