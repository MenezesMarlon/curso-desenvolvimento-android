package com.menezesmarlon.jokenpoapp;

public class Jogo {
    int vitorias = 0;
    int derrotas = 0;
    int empates = 0;



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

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }



}