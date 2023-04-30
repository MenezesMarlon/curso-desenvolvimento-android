package com.menezesmarlon.jokenpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int vitorias = 0;
    int derrotas = 0;
    int empates = 0;


    public void opcaoPedra(View view) {
        this.opcaoEscolhida("Pedra");
    }

    public void opcaoPapel(View view) {
        this.opcaoEscolhida("Papel");
    }

    public void opcaoTesoura(View view) {
        this.opcaoEscolhida("Tesoura");
    }

    public void opcaoEscolhida(String escolhaJogador) {

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


        if (escolhaJogador.equals("Pedra") && escolhaApp.equals("Tesoura")
                || escolhaJogador.equals("Papel") && escolhaApp.equals("Pedra")
                || escolhaJogador.equals("Tesoura") && escolhaApp.equals("Papel")) {

            vitorias++;
            textPontosVoce.setText(String.valueOf(vitorias));

        } else if (escolhaJogador.equals("Pedra") && escolhaApp.equals("Pedra")
                || escolhaJogador.equals("Papel") && escolhaApp.equals("Papel")
                || escolhaJogador.equals("Tesoura") && escolhaApp.equals("Tesoura")) {

            empates++;
            textPontosEmpate.setText(String.valueOf(empates));

        } else {
            derrotas++;
            textPontosMaquina.setText(String.valueOf(derrotas));
        }
    }


}