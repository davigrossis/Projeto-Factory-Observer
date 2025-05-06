package org.example;

public class PedidoEstadoAceito extends PedidoEstado {

    private PedidoEstadoAceito() {}
    private static PedidoEstadoAceito instance = new PedidoEstadoAceito();
    public static PedidoEstadoAceito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aceitando";
    }

    @Override
    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        return true;
    }
}
