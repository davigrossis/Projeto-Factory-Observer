package org.example;

public class ServicoFarmacia implements IServico {

    @Override
    public String aceitar() {
        return "Pedido aceito pela drogaria";
    }

    @Override
    public String cancelar() {
        return "Pedido de farmácia cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        return "Remédios estão sendo separados";
    }

    @Override
    public String enviar() {
        return "Pedido saiu para entrega com o entregador";
    }
}
