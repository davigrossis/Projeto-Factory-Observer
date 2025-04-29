package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Hamburgueria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Pizzaria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}
