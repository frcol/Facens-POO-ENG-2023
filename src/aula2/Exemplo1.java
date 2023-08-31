package aula2;

import java.util.Scanner;


public class Exemplo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        String opt;
        int idade = 0;
        
        do {
            System.out.println("1- Cadastrar, 2- Mostrar, 3- Sair");
            opt = scan.next();
            
            switch (opt) {
                case "1":
                    System.out.println("Nome:");
                    nome = scan.next();
                    System.out.println("Idade:");
                    idade = scan.nextInt();
                    break;
                case "2":
                    System.out.println("==================");
                    System.out.println("Nome: "+nome);
                    System.out.println("Idade: "+idade);
                    break;
                case "3":
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
            
        } while (!opt.equals("3"));
    } 
}
