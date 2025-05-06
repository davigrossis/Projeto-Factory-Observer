package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido("pizza");
    }

    @Test
    public void devePrepararPedidoAceito() {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoPreparado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoAceito() {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoAceito() {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveAceitarPedidoAceitoNovamente() {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        assertFalse(pedido.aceitar());
    }

    // Estado: Preparado

    @Test
    public void deveEnviarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertFalse(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDevePrepararPedidoPreparadoNovamente() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveAceitarPedidoPreparado() {
        pedido.setEstado(PedidoEstadoPreparado.getInstance());
        assertFalse(pedido.aceitar());
    }

    // Estado: Enviado

    @Test
    public void naoDeveAceitarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.aceitar());
    }

    @Test
    public void naoDevePrepararPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveEnviarPedidoEnviadoNovamente() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertFalse(pedido.enviar());
    }

    // Estado: Cancelado

    @Test
    public void naoDeveAceitarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aceitar());
    }

    @Test
    public void naoDevePrepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoCanceladoNovamente() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }


    //CASO DE TESTE SINGLETON

    @Test
    public void deveRetornarPedidoAceitando() {
        assertEquals("Pedido aceito", PedidoEstadoAceito.getInstance().getEstado());
    }

    @Test
    public void deveRetornarPedidoPreparado() {
        assertEquals("Pedido preparando", PedidoEstadoPreparado.getInstance().getEstado());
    }

    @Test
    public void deveRetornarPedidoEnviado() {
        assertEquals("Pedido enviado", PedidoEstadoEnviado.getInstance().getEstado());
    }

    @Test
    public void deveRetornarPedidoCancelado() {
        assertEquals("Pedido cancelado", PedidoEstadoCancelado.getInstance().getEstado());
    }


}
