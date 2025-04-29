package org.example;

import java.util.Observer;

public class ServicoFarmacia implements IServico {

    private Pedido pedido = new Pedido("Farmacia");

    public void addObserver(Observer observer) {
        pedido.addObserver(observer);
    }

    @Override
    public String aceitar() {
        pedido.atualizarStatus("Pedido aceito pela farmacia");
        return "Pedido de remedios aceito pela farmacia";
    }

    @Override
    public String cancelar() {
        pedido.atualizarStatus("Pedido cancelado pelo cliente");
        return "Pedido de remedios cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        pedido.atualizarStatus("Remedios estão sendo separados");
        return "Remedios estão sendo separados";
    }

    @Override
    public String enviar() {
        pedido.atualizarStatus("Remedios sairam para entrega com o entregador");
        return "Remedios sairam para entrega com o entregador";
    }
}