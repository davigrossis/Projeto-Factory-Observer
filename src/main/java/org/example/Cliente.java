package org.example;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.ultimaNotificacao = "Cliente " + nome + " recebeu notificação: " + arg;
        System.out.println(this.ultimaNotificacao);
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}
