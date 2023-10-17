package aula8_ArrayList_JOpion.Exercicio1;

import java.util.ArrayList;
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
        
        ArrayList<Vendedor> lstVendedores = new ArrayList<>();
        
        while(!opt.equals("4")) { 
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Calcular Venda\n3- Apagar\n4- Sair");
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
                    lstVendedores.add(v);
                    break;
                case "2":
                    if (!lstVendedores.isEmpty()) {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                        for (Vendedor venTmp : lstVendedores) {
                            if (venTmp.getCodigo()== codigo) {
                               v = venTmp;
                            } 
                       }  
                        
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                        String descontoStr = JOptionPane.showInputDialog("Desconto: ");
                        if (descontoStr.equals("")) {
                            JOptionPane.showMessageDialog(null, v.imprimir(valor));
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
                    if (!lstVendedores.isEmpty()) {
                       codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                        
                       for (int i=0; i < lstVendedores.size(); i++) {
                            if (lstVendedores.get(i).getCodigo()== codigo) {
                               lstVendedores.remove(i);
                            } 
                       }    
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar um vendedor antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
}
