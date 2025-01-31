package com.conceitoStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço original do produto:");
        double precoOriginal = scanner.nextDouble();

        System.out.println("Escolha o desconto: 1 - Natal (10%) | 2 - Ano Novo (15%)");
        int opcao = scanner.nextInt();

        Desconto desconto;

        if (opcao == 1) {
            desconto = new DescontoNatal();
        } else if (opcao == 2) {
            desconto = new DescontoAnoNovo();
        } else {
            System.out.println("Opção inválida! Aplicando sem desconto.");
            desconto = preco -> preco; // Expressão lambda para "nenhum desconto"
        }

        // Aplicar o desconto
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto(desconto);
        double precoFinal = calculadora.calcular(precoOriginal);

        System.out.println("Preço final com desconto: R$ " + precoFinal);
        scanner.close();
    }
}
