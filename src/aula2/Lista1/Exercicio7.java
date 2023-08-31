package aula2.Lista1;

import java.util.Scanner;
/*
Uma empresa deseja aumentar seus preços em 20%. 
Faça um algoritmo que leia o código e 
o preço de custo de cada produto e calcule o preço novo.

Calcule também, a média dos preços com e sem aumento. 
Mostre o código e o preço novo de cada produto e, no final, as médias. 
A entrada de dados deve terminar quando for lido um código de produto negativo.
*/
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double precoCusto, precoNovo, somaPrecoCusto = 0, somaPrecoNovo = 0;
        int quantidadeProdutos = 0;

        do {
            System.out.print("Digite o código do produto (ou um número negativo para sair): ");
            codigo = scanner.nextInt();

            if (codigo >= 0) {
                System.out.print("Digite o preço de custo do produto: R$");
                precoCusto = scanner.nextDouble();

                precoNovo = precoCusto * 1.2; // Aumento de 20%
                somaPrecoCusto += precoCusto;
                somaPrecoNovo += precoNovo;
                quantidadeProdutos++;

                System.out.printf("Código do produto: %d | Preço novo: R$%.2f\n", codigo, precoNovo);
            }
        } while (codigo >= 0);

        double mediaPrecoCusto = somaPrecoCusto / quantidadeProdutos;
        double mediaPrecoNovo = somaPrecoNovo / quantidadeProdutos;

        System.out.printf("Média dos preços de custo: R$%.2f | Média dos preços com aumento: R$%.2f\n",
                mediaPrecoCusto, mediaPrecoNovo);
    }
}
