package com.menezesmarlon.jokenpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Jogo jogo = new Jogo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    private void jogar(String escolhaJogador) {
        ImageView imagePadrao = findViewById(R.id.imagePadrao);
        TextView textOpcaoEscolhida = findViewById(R.id.textOpcaoEscolhida);
        TextView textPontosVoce = findViewById(R.id.textPontosVoce);
        TextView textPontosMaquina = findViewById(R.id.textPontosMaquina);
        TextView textPontosEmpate = findViewById(R.id.textPontosEmpate);


        textOpcaoEscolhida.setText("Você Escolheu: " + escolhaJogador);

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