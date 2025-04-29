package org.example;

public class ServicoFactory {
    public ServicoFactory() {
    }

    public static IServico obterServico(String tipoPedido) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Servico" + tipoPedido);
            objeto = classe.newInstance();
        } catch (Exception var4) {
            throw new IllegalArgumentException("Serviço inexistente");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        } else {
            return (IServico) objeto;
        }
    }
}