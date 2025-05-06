package org.example;

public class PedidoEstadoEnviado extends PedidoEstado {

    private PedidoEstadoEnviado() {}
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido enviado";
    }
}
