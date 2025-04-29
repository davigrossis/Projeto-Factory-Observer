package org.example;

import java.util.Observable;
import java.util.Observer;

public class Pedido extends Observable {

    private String tipo;

    public Pedido(String tipo) {
        this.tipo = tipo;
    }

    public void atualizarStatus(String status) {
        setChanged();
        notifyObservers( tipo + " atualizou o status do seu pedido: " + status);
    }

    @Override
    public String toString() {
        return "Pedido de " + tipo;
    }
}
