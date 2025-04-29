package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFarmaciaTest {

    @Test
    void deveAceitarPedidoFarmacia() {
        IServico servico = ServicoFactory.obterServico("Farmacia");
        assertEquals("Pedido de remedios aceito pela farmacia", servico.aceitar());
    }

    @Test
    void deveCancelarPedidoFarmacia() {
        IServico servico = ServicoFactory.obterServico("Farmacia");
        assertEquals("Pedido de remedios cancelado pelo cliente", servico.cancelar());
    }

    @Test
    void devePrepararPedidoFarmacia() {
        IServico servico = ServicoFactory.obterServico("Farmacia");
        assertEquals("Remedios estão sendo separados", servico.preparar());
    }

    @Test
    void deveEnviarPedidoFarmacia() {
        IServico servico = ServicoFactory.obterServico("Farmacia");
        assertEquals("Remedios sairam para entrega com o entregador", servico.enviar());
    }

}
