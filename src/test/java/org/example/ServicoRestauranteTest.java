package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoRestauranteTest {

    @Test
    void deveAceitarPedidoRestaurante() {
        IServico servico = ServicoFactory.obterServico("Restaurante");
        assertEquals("Pedido de comida aceito pelo restaurante", servico.aceitar());
    }

    @Test
    void deveCancelarPedidoRestaurante() {
        IServico servico = ServicoFactory.obterServico("Restaurante");
        assertEquals("Pedido de comida cancelado pelo cliente", servico.cancelar());
    }

    @Test
    void devePrepararPedidoRestaurante() {
        IServico servico = ServicoFactory.obterServico("Restaurante");
        assertEquals("Comida está sendo preparada", servico.preparar());
    }

    @Test
    void deveEnviarPedidoRestaurante() {
        IServico servico = ServicoFactory.obterServico("Restaurante");
        assertEquals("Comida saiu para entrega com o entregador", servico.enviar());
    }

}
