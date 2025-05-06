package org.example;

import java.util.Observable;

public class Pedido extends Observable {

    private String tipo;
    private PedidoEstado estado;

    public Pedido(String tipo) {
        this.tipo = tipo;
        this.estado = PedidoEstadoAceito.getInstance(); // Estado inicial
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public boolean aceitar() {
        return estado.aceitar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public void atualizarStatus(String status) {
        setChanged();
        notifyObservers(tipo + " atualizou o status do seu pedido: " + status);
    }

    @Override
    public String toString() {
        return "Pedido de " + tipo;
    }
}
