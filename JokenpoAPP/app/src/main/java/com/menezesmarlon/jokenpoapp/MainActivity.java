package com.menezesmarlon.jokenpoapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

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
        ImageView imagePadrao = findViewById(R.id.imagePadrao);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
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

    }
}