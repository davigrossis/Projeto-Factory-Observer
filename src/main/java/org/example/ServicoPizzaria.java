package org.example;

import java.util.Observer;

public class ServicoPizzaria {
    private Pedido pedido = new Pedido("Pizzaria");

    public void addObserver(Observer observer) {
        pedido.addObserver(observer);
    }

    public String aceitar() {
        pedido.atualizarStatus("Pedido aceito pela pizzaria");
        return "Pedido de comida aceito pela pizzaria";
    }

    public String cancelar() {
        pedido.atualizarStatus("Pedido cancelado pelo cliente");
        return "Pedido de comida cancelado pelo cliente";
    }

    public String preparar() {
        pedido.atualizarStatus("Pizza está sendo preparada");
        return "Pizza está sendo preparada";
    }

    public String enviar() {
        pedido.atualizarStatus("Pizza saiu para entrega com o entregador");
        return "Pizza saiu para entrega com o entregador";
    }
}
