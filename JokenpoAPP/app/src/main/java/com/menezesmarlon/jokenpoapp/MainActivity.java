package com.menezesmarlon.jokenpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Jogo jogo = new Jogo();
    ImageView imagePadrao;
    TextView textOpcaoEscolhida;
    TextView textPontosVoce;
    TextView textPontosMaquina;
    TextView textPontosEmpate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagePadrao = findViewById(R.id.imagePadrao);
        textOpcaoEscolhida = findViewById(R.id.textOpcaoEscolhida);
        textPontosVoce = findViewById(R.id.textPontosVoce);
        textPontosMaquina = findViewById(R.id.textPontosMaquina);
        textPontosEmpate = findViewById(R.id.textPontosEmpate);
    }

    public void opcaoPedra(View view) {
        jogar("Pedra");
    }

    public void opcaoPapel(View view) {
        jogar("Papel");
    }

    public void opcaoTesoura(View view) {
        jogar("Tesoura");
    }

    public void zerarPontuação(View view) {
        jogo.setVitorias(0);
        jogo.setDerrotas(0);
        jogo.setEmpates(0);
        textPontosVoce.setText(String.valueOf(jogo.getVitorias()));
        textPontosMaquina.setText(String.valueOf(jogo.getDerrotas()));
        textPontosEmpate.setText(String.valueOf(jogo.getEmpates()));
    }


    private void jogar(String escolhaJogador) {
        imagePadrao = findViewById(R.id.imagePadrao);
        textOpcaoEscolhida = findViewById(R.id.textOpcaoEscolhida);
        textPontosVoce = findViewById(R.id.textPontosVoce);
        textPontosMaquina = findViewById(R.id.textPontosMaquina);
        textPontosEmpate = findViewById(R.id.textPontosEmpate);


        textOpcaoEscolhida.setText("Você escolher: " + escolhaJogador);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "Pedra":
                imagePadrao.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imagePadrao.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagePadrao.setImageResource(R.drawable.tesoura);
                break;
        }

        jogo.jogar(escolhaJogador, escolhaApp);
        textPontosVoce.setText(String.valueOf(jogo.getVitorias()));
        textPontosMaquina.setText(String.valueOf(jogo.getDerrotas()));
        textPontosEmpate.setText(String.valueOf(jogo.getEmpates()));
    }
}