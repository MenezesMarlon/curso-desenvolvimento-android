package com.menezesmarlon.jokenpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoPedra(View view) {
        this.opcaoEscolhida("Pedra");
    }

    public void opcaoPapel(View view) {
        this.opcaoEscolhida("Papel");
    }

    public void opcaoTesoura(View view) {
        this.opcaoEscolhida("Tesoura");
    }

    public void opcaoEscolhida(String opcao) {
        TextView textOpcaoEscolhida = findViewById(R.id.textOpcaoEscolhida);
        textOpcaoEscolhida.setText("Você Escolheu: " + opcao);
    }
}