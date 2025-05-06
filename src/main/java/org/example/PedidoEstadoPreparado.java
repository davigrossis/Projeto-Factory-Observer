package org.example;

public class PedidoEstadoPreparado extends PedidoEstado{

    private PedidoEstadoPreparado() {}
    private static PedidoEstadoPreparado instance = new PedidoEstadoPreparado();
    public static PedidoEstadoPreparado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido preparando";
    }

    @Override
    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }
}
