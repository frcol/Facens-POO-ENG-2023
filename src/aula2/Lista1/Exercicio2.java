package aula2.Lista1;

import java.util.Scanner;
/*
 Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de 
códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:   
1,2,3,4 = voto para os respectivos candidatos; 
5 = voto nulo; 
6 = voto em branco; 
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva: 
- total de votos para cada candidato; 
- total de votos nulos; 
- total de votos em branco; 
Como finalizador do conjunto de votos, tem-se o valor 0. 
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;

        do {
            System.out.print("Digite o codigo do candidato (ou 0 para sair): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Codigo invalido.");
                    break;
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
    }
}
