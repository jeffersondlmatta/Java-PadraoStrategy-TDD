package com.conceitoStrategy;

public class CalculadoraDeDesconto {
    private Desconto desconto;


    public CalculadoraDeDesconto(Desconto desconto) {
        this.desconto = desconto;
    }


    public double calcular(double preco) {
        return desconto.aplicarDesconto(preco);
    }

    public class DescontoNatal implements Desconto {
        public static final double DESCONTO = 0.90;
        @Override
        public double aplicarDesconto(double preco) {
            return preco * DESCONTO;
        }
    }

    public class DescontoAnoNovo implements Desconto {
        public static final double DESCONTO = 0.85;
        @Override
        public double aplicarDesconto(double preco) {
            return preco * DESCONTO;
        }
    }


}
