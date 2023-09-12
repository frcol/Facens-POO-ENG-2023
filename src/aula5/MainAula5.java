package aula5;

import java.util.Scanner;

public class MainAula5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = null;
        String opt = "";

        String ra;
        String nome;
        String curso;

        do {
            System.out.println("\n================");
            System.out.println("1- Cadastrar Aluno \n2- Mostrar aluno \n3- Sair");
            opt = scan.next();

            switch (opt) {
                case "1":
                    System.out.println("Ra:");
                    ra = scan.next();
                    System.out.println("Nome:");
                    nome = scan.next();
                    System.out.println("Curso:");
                    curso = scan.next();

                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setCurso(curso);

                    break;
                case "2":
                    System.out.println(aluno.imprimir());
                    break;
                case "3":
                    System.out.println("Volte sempre");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (!opt.equals("3"));

    }
}
