package org.example;

public class ServicoRestaurante implements IServico {

    @Override
    public String aceitar() {
        return "Pedido de comida aceito pelo restaurante";
    }

    @Override
    public String cancelar() {
        return "Pedido de comida cancelado pelo cliente";
    }

    @Override
    public String preparar() {
        return "Comida está sendo preparada";
    }

    @Override
    public String enviar() {
        return "Comida saiu para entrega com o entregador";
    }
}
