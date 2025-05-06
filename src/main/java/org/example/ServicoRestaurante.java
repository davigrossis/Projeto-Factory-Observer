package org.example;

import java.util.Observer;

public class ServicoRestaurante implements IServico {

    private Pedido pedido = new Pedido("Restaurante");

    @Override
    public String aceitar() {
        pedido.atualizarStatus("Pedido aceito pelo restaurante");
        return "Pedido de comida aceito pelo restaurante";
    }

    @Override
    public String cancelar() {
        pedido.atualizarStatus("Pedido cancelado pelo cliente");
        return "Pedido de comida cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        pedido.atualizarStatus("Comida está sendo preparada");
        return "Comida está sendo preparada";
    }

    @Override
    public String enviar() {
        pedido.atualizarStatus("Comida saiu para entrega com o entregador");
        return "Comida saiu para entrega com o entregador";
    }
}
