package aula4;

import java.util.Scanner;

public class MainPOO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        
        Aluno aluno1;
        
        aluno1 = new Aluno();
        aluno1.nome = nome;
        aluno1.ra = "27842734";
        aluno1.curso = "ADS";
        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Fabio";
        aluno2.ra = "34534534";
        aluno2.curso = "Jogos";
        
        System.out.println("Nome do aluno1:"+aluno1.nome);
        System.out.println("Nome do aluno2: "+aluno2.nome);
        
        aluno1.nome = "Chico";
        System.out.println("Nome do aluno1:"+aluno1.nome);
    }
}
