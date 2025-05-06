package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveNotificarClienteAceitar() {
        Pedido pedido = new Pedido("Restaurante");
        Cliente cliente = new Cliente("Maria");
        cliente.criarPedido(pedido);
        pedido.atualizarStatus("Pedido aceito pelo restaurante");

        assertEquals("Cliente Maria recebeu notificação: Restaurante atualizou o status do seu pedido: Pedido aceito pelo restaurante", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteCancelar() {
        Pedido pedido = new Pedido("Farmacia");
        Cliente cliente = new Cliente("Carlos");
        cliente.criarPedido(pedido);
        pedido.atualizarStatus("Pedido de remedios cancelado pelo cliente");

        assertEquals("Cliente Carlos recebeu notificação: Farmacia atualizou o status do seu pedido: Pedido de remedios cancelado pelo cliente", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientePreparar() {
        Pedido pedido = new Pedido("Mercado");
        Cliente cliente = new Cliente("Joana");
        cliente.criarPedido(pedido);
        pedido.atualizarStatus("Produtos estão sendo separados");

        assertEquals("Cliente Joana recebeu notificação: Mercado atualizou o status do seu pedido: Produtos estão sendo separados", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteEnviar() {
        Pedido pedido = new Pedido("Restaurante");
        Cliente cliente = new Cliente("Bruno");
        cliente.criarPedido(pedido);
        pedido.atualizarStatus("Comida saiu para entrega com o entregador");

        assertEquals("Cliente Bruno recebeu notificação: Restaurante atualizou o status do seu pedido: Comida saiu para entrega com o entregador", cliente.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClienteNaoInscrito() {
        Pedido pedido = new Pedido("Restaurante");
        Cliente cliente = new Cliente("Maria");
        pedido.atualizarStatus("Pedido aceito pelo restaurante");

        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientesDiferentes() {
        Pedido pedido = new Pedido("Mercado");
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Ana");

        cliente1.criarPedido(pedido);
        cliente2.criarPedido(pedido);

        pedido.atualizarStatus("Pedido enviado");

        assertEquals("Cliente João recebeu notificação: Mercado atualizou o status do seu pedido: Pedido enviado", cliente1.getUltimaNotificacao());
        assertEquals("Cliente Ana recebeu notificação: Mercado atualizou o status do seu pedido: Pedido enviado", cliente2.getUltimaNotificacao());
    }

    @Test
    void clienteRecebeNotificacaoDoPedidoCorreto() {
        Pedido pedidoRestaurante = new Pedido("Restaurante");
        Pedido pedidoFarmacia = new Pedido("Farmacia");

        Cliente cliente1 = new Cliente("Clara");
        Cliente cliente2 = new Cliente("Lucas");

        cliente1.criarPedido(pedidoRestaurante);
        cliente2.criarPedido(pedidoFarmacia);

        pedidoRestaurante.atualizarStatus("Pedido em preparo");
        pedidoFarmacia.atualizarStatus("Remédios prontos para entrega");

        assertEquals("Cliente Clara recebeu notificação: Restaurante atualizou o status do seu pedido: Pedido em preparo", cliente1.getUltimaNotificacao());
        assertEquals("Cliente Lucas recebeu notificação: Farmacia atualizou o status do seu pedido: Remédios prontos para entrega", cliente2.getUltimaNotificacao());
    }
}
