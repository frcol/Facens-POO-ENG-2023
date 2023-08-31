package aula2.Lista1;

import java.util.Scanner;
/*
 Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre: 
- a quantidade de pessoas com mais de 90 quilos;  
- a média das idades das sete pessoas 
*/
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int peso, idade, mais90 = 0, somaIdades = 0, numPessoas = 7;
        double mediaIdades;
        
        for(int i = 1; i <= numPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            idade = scan.nextInt();
            
            System.out.println("Digite o peso da pessoa " + i + ":");
            peso = scan.nextInt();
            
            somaIdades += idade;
            
            if(peso > 90) {
                mais90++;
            }
        }
        
        mediaIdades = (double) somaIdades / numPessoas;
        
        System.out.println("Quantidade de pessoas com mais de 90kg: " + mais90);
        System.out.println("Média das idades: " + mediaIdades);
    }
}
