package com.menezesmarlon.jokenpoapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.menezesmarlon.jokenpoapp.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    Jogo jogo = new Jogo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
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

    public void clearCount(View view) {
        jogo.clearCounts();
        updateViews();
    }

    private void updateViews() {
        binding.textPontosVoce.setText(String.valueOf(jogo.getVitorias()));
        binding.textPontosMaquina.setText(String.valueOf(jogo.getDerrotas()));
        binding.textPontosEmpate.setText(String.valueOf(jogo.getEmpates()));
    }



    private void jogar(String escolhaJogador) {
        binding.textOpcaoEscolhida.setText("Você escolheu: " + escolhaJogador);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "Pedra":
                binding.imagePadrao.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                binding.imagePadrao.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                binding.imagePadrao.setImageResource(R.drawable.tesoura);
                break;
        }

        jogo.jogar(escolhaJogador, escolhaApp);
        binding.textPontosVoce.setText(String.valueOf(jogo.getVitorias()));
        binding.textPontosMaquina.setText(String.valueOf(jogo.getDerrotas()));
        binding.textPontosEmpate.setText(String.valueOf(jogo.getEmpates()));
    }
}