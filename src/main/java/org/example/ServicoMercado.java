package org.example;

public class ServicoMercado implements IServico {

    @Override
    public String aceitar() {
        return "Pedido aceito pelo mercado";
    }

    @Override
    public String cancelar() {
        return "Pedido de mercado cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        return "Produtos estão sendo separados";
    }

    @Override
    public String enviar() {
        return "Produtos saiu para entrega com o entregador";
    }
}
