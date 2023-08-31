package aula2.Lista1;

import java.util.Scanner;
/*
 Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. 
O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o 
código for igual a zero. 
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoAluno;
        double nota1, nota2, nota3, media;

        do {
            System.out.print("Digite o codigo do aluno (ou 0 para sair): ");
            codigoAluno = scanner.nextInt();

            if (codigoAluno != 0) {
                System.out.print("Digite a primeira nota: ");
                nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota: ");
                nota3 = scanner.nextDouble();

                media = (nota1 + nota2 + nota3) / 3;

                System.out.println("Media do aluno " + codigoAluno + ": " + media);
            }
        } while (codigoAluno != 0);
    }
}
