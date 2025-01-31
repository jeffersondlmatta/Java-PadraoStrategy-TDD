package com.conceitoStrategy;

public class DescontoAnoNovo implements Desconto {

    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.8;
    }
}
