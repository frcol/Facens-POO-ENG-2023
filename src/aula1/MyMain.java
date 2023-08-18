package aula1;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
       System.out.println("Ola java!!");
       
        System.out.println("Minha idade:" + 50);
        
        String cidade = "Sorocaba";
        int idade;
        char sexo = 'm';
        boolean estaAtivo = true;
        double valor = 10.3;
        float salario = 10.3f;
        
        idade = 50;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva seu nome:");
        String nome = scan.next();
        
        System.out.println("Ola "+nome+"!");
        
        System.out.println("Idade:");
        idade = scan.nextInt();
        
        System.out.println("Sua idade "+idade);
        
        if (idade > 18) {
            System.out.println("Voce pode entrar");
        } else {
            System.out.println("Proibido");
        }
        
        
    }   
}
