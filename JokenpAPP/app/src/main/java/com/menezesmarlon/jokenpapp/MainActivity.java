package com.menezesmarlon.jokenpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcao){
        TextView textOpcaoEscolhida = findViewById(R.id.textOpcaoEscolhida);
        textOpcaoEscolhida.setText("Você Escolheu: " + opcao);
    }



}