
package aula5.Exercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt = "";
        
        Aluno aluno = null;
        String ra, nome;
        float ac1, ac2, ag, af;
        
      
        while(!opt.equals("3")) {
            System.out.println("\n1- Cadastrar\n2- Consultar\n3- Sair");
            opt = scan.next();
            if (opt == null) {
                System.exit(0);
            }
            
            switch(opt){
                case "1":
                    System.out.println("RA:");
                    ra = scan.next();
                    System.out.println("Nome:");
                    nome = scan.next();
                    System.out.println("AC1:");
                    ac1 = scan.nextFloat();
                    System.out.println("AC2:");
                    ac2 = scan.nextFloat();
                    System.out.println("AG:");
                    ag = scan.nextFloat();
                    System.out.println("AF:");
                    af = scan.nextFloat();
                    
                    aluno = new Aluno(ra, nome, ac1, ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;
                case "2":
                    if (aluno == null) {
                        System.out.println("Aluno não foi cadastrada!");
                    } else {
                        System.out.println(aluno.imprimir());
                    }
                    break;
                case "3":
                     System.out.println("Até a próxima");
                    break;
                default:
                     System.out.println("Opcao Invalida");
                    break;
            }
        }
    }
}
