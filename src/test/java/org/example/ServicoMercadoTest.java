package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoMercadoTest {

    @Test
    void deveAceitarPedidoMercado() {
        IServico servico = ServicoFactory.obterServico("Mercado");
        assertEquals("Pedido de produtos aceito pelo mercado", servico.aceitar());
    }

    @Test
    void deveCancelarPedidoMercado() {
        IServico servico = ServicoFactory.obterServico("Mercado");
        assertEquals("Pedido de produtos cancelado pelo cliente", servico.cancelar());
    }

    @Test
    void devePrepararPedidoMercado() {
        IServico servico = ServicoFactory.obterServico("Mercado");
        assertEquals("Produtos estão sendo separados", servico.preparar());
    }

    @Test
    void deveEnviarPedidoMercado() {
        IServico servico = ServicoFactory.obterServico("Mercado");
        assertEquals("Produtos sairam para entrega com o entregador", servico.enviar());
    }

}
