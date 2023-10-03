package aula5.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt = "";
        Funcionario f = null;
        
        int cracha;
        String nome;
        char tipoVinculo;
        float valorHora, qtdeHora, salario, valorDesconto;
        
        while(!opt.equals("4")) {
            System.out.println("1- Cadastrar\n2- Consultar\n3- Alterar\n4- Sair");
            opt =  scan.next();
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    System.out.println("Cracha:");
                    cracha = scan.nextInt();
                    System.out.println("Nome:");
                    nome = scan.next();
                    System.out.println("Tipo Vinculo:");
                    tipoVinculo =  scan.next().charAt(0);
                    System.out.println("Valor Desconto:");
                    valorDesconto = scan.nextFloat();
                    
                    f = new Funcionario();
                    f.setCracha(cracha);
                    f.setNome(nome);
                    f.setTipoVinculo(tipoVinculo);
                    f.setValorDesconto(valorDesconto);
                    
                    if (f.getTipoVinculo() == 'H') {
                        System.out.println("Quantidade Hora:");
                        qtdeHora = scan.nextFloat();
                        System.out.println("Valor hora:");
                        valorHora = scan.nextFloat();
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        System.out.println("Salario:");
                        salario = scan.nextFloat();
                    }
                    
                    f.setSalario(salario);
                    break;
                case "2":
                    if (f != null) {
                         System.out.println(f.imprimir());
                    } else {
                        System.out.println("Funcionario não foi cadastrada!");
                    }
                    break;
                case "3":
                    if (f == null) {
                        System.out.println("Funcionario não foi cadastrada!");
                        break;
                    }
                    
                    if (f.getTipoVinculo() == 'H') {
                        System.out.println("Quantidade Hora:");
                        qtdeHora = scan.nextFloat();
                        System.out.println("Valor hora:");
                        valorHora = scan.nextFloat();
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        System.out.println("Salario:");
                        salario = scan.nextFloat();
                    }
                    
                    f.setSalario(salario);
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        }
        
    }
}
