package org.example;

import java.util.Observer;

public class ServicoMercado implements IServico {

    private Pedido pedido = new Pedido("Mercado");

    @Override
    public String aceitar() {
        pedido.atualizarStatus("Pedido aceito pelo mercado");
        return "Pedido de produtos aceito pelo mercado";
    }

    @Override
    public String cancelar() {
        pedido.atualizarStatus("Pedido cancelado pelo cliente");
        return "Pedido de produtos cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        pedido.atualizarStatus("Produtos estão sendo separados");
        return "Produtos estão sendo separados";
    }

    @Override
    public String enviar() {
        pedido.atualizarStatus("Produtos sairam para entrega com o entregador");
        return "Produtos sairam para entrega com o entregador";
    }
}