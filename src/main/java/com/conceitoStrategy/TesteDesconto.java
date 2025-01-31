package com.conceitoStrategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteDesconto {

    @Test
    public void deveAplicarDescontoDeNatal(){
        double precoOriginal = 100.0;

        Desconto desconto = new DescontoNatal();

        double precocomDesconto = desconto.aplicarDesconto(precoOriginal);

        double precoEsperado = 90.0;

        assertEquals(precoEsperado, precocomDesconto, 0.01);

    }
    @Test
    public void deveAplicarDescontoAnoNovo(){
        double precoOriginal = 200.0;
        Desconto desconto = new DescontoAnoNovo();

        double precocomDesconto = desconto.aplicarDesconto(precoOriginal);
        double precoEsperado = 160.0;

        assertEquals(precoEsperado, precocomDesconto, 0.01);


    }

}
