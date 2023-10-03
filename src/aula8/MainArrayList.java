package aula8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainArrayList {
    public static void main(String[] args) {
        Aluno alu = null;
        ArrayList<Aluno> lstAlunos = new ArrayList<>();
           
        String opt = "";
        String nome;
        String ra;
        
        do {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Mostrar\n3- Busca\n4- Remover\n5- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1": // CADASTRAR
                    nome = JOptionPane.showInputDialog("Nome:");
                    ra = JOptionPane.showInputDialog("RA:");
                    
                    alu = new Aluno(nome, ra);
                    lstAlunos.add(alu);
                    
                    break;
                case "2": // MOSTRAR
                    if (lstAlunos.isEmpty()) {
                        return;
                    }
                    
                    String str = "";
                    /*for (int i = 0; i < lstAlunos.size(); i++) {
                        str += lstAlunos.get(i).imprimir();
                    }*/
                    
                    for (Aluno aluTmp : lstAlunos) {
                        str += aluTmp.imprimir();
                    }
                    
                    JOptionPane.showMessageDialog(null, 
                                str);
                    break;
                case "3":
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opcao Invalida",
                            "Problema!!!",
                            JOptionPane.WARNING_MESSAGE);
            }
        } while (!opt.equals("5"));
    }
}
