package aula6.Exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Apolice ap = null;
        
        int numero, idade;
        String nome;
        char sexo;
        double valorAuto;
        
        while(!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n 2- Consultar\n 3- Sair");
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    numero = Integer.parseInt(JOptionPane.showInputDialog("NUmero:"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    sexo = JOptionPane.showInputDialog("Sexo:").charAt(0);
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    valorAuto = Double.parseDouble(JOptionPane.showInputDialog("Valor Auto:"));
                    
                    ap = new Apolice(numero, nome, idade, sexo, valorAuto);
                    break;
                case "2":
                    if (ap != null) {
                        JOptionPane.showMessageDialog(null, ap.imprimir() );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                                                "Opcao Invalida", 
                                                "Ops...deu errado!",
                                                JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        
    }
}
