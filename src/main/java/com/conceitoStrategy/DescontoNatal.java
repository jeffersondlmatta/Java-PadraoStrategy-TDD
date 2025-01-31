package com.conceitoStrategy;

public class DescontoNatal implements Desconto {

    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9;
    }
}
