package aula6.Exercicio2;

import aula1.*;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String opt = "";
        Vendedor v = null;
        
        int codigo;
        String nome;
        double percentual;
        double valor;
        double desconto;
        
        while(!opt.equals("3")) { 
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Calcular Venda\n3- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    // Entrada do usuário
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual de comissao: "));
                    
                    // atrinui valores ao objeto
                    v = new Vendedor(codigo, nome, percentual);
                    break;
                case "2":
                    if (v != null) {
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                        String descontoStr = JOptionPane.showInputDialog("Desconto: ");
                        if (descontoStr.equals("")) {
                            JOptionPane.showMessageDialog(null, v.imprimir(valor) );
                        }
                        else {
                            JOptionPane.showMessageDialog(null, v.imprimir(valor, Double.parseDouble(descontoStr)) );
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
}
