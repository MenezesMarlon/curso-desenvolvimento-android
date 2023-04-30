package com.menezesmarlon.jokenpoapp;

public class Jogo {
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    public void jogar(String escolhaJogador, String escolhaApp) {

        if (escolhaJogador.equals("Pedra") && escolhaApp.equals("Tesoura")
                || escolhaJogador.equals("Papel") && escolhaApp.equals("Pedra")
                || escolhaJogador.equals("Tesoura") && escolhaApp.equals("Papel")) {

            vitorias++;

        } else if (escolhaJogador.equals("Pedra") && escolhaApp.equals("Pedra")
                || escolhaJogador.equals("Papel") && escolhaApp.equals("Papel")
                || escolhaJogador.equals("Tesoura") && escolhaApp.equals("Tesoura")) {

            empates++;

        } else {
            derrotas++;
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

}