package aula5.Exercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt = "";
        Pessoa p = null;
        
        String cpf, nome;
        char sexo;
        int idade;
        
        while(!opt.equals("3")) {
            System.out.println("\n1- Cadastrar\n2- Consultar\n3- Sair");
            opt = scan.next();
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    System.out.println("CPF:");
                    cpf = scan.next();
                    System.out.println("Nome:");
                    nome = scan.next();;
                    System.out.println("Sexo:");
                    sexo = scan.next().charAt(0);
                    System.out.println("Idade:");
                    idade = scan.nextInt();
                    
                    p = new Pessoa(cpf, nome, sexo, idade);
                    /*p.setCpf(cpf);
                    p.setNome(nome);
                    p.setSexo(sexo);
                    p.setIdade(idade);*/
                    
                    break;
                case "2":
                    if (p != null) {
                        System.out.println(p.imprimir());
                    } else {
                        System.out.println("Voce precisa cadastrar a Pessoa antes."); 
                    }
                    break;
                default:
                    System.out.println("Opcao Invalida");
                     break;
            }
        }
        
    }
}
