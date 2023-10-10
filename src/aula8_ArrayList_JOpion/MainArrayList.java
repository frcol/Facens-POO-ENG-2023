package aula8_ArrayList_JOpion;

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
                    
                    alu = new Aluno(ra, nome);
                    lstAlunos.add(alu);
                    
                    break;
                case "2": // MOSTRAR
                    if (lstAlunos.isEmpty()) {
                        continue;
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
                case "3": // Busca
                    if (lstAlunos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Cadastre um Aluno antes.");
                        continue;
                    }
                    
                    boolean achou = false;
                    ra = JOptionPane.showInputDialog("RA:");
                    
                    for (Aluno a : lstAlunos) {
                        if (a.getRa().equals(ra)) {
                            achou = true;
                            JOptionPane.showMessageDialog(null, a.imprimir());
                        }
                    }
                    
                    if (!achou) {
                        JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
                    }
                    
                    break;
                case "4": // Remover
                    if (lstAlunos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Cadastre um Aluno antes.");
                        continue;
                    }
                    
                    boolean achou2 = false;
                    ra = JOptionPane.showInputDialog("RA:");
                    
                    // Nao usar FOREACH para remover, causa erro na lista
                    for (int i=0; i < lstAlunos.size(); i++) {
                        if (lstAlunos.get(i).getRa().equals(ra)) {
                            achou2 = true;
                            JOptionPane.showMessageDialog(null, lstAlunos.get(i).getNome()+ " foi removido");
                            lstAlunos.remove(i);
                        }
                    }
                                       
                    if (!achou2) {
                        JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
                    }
                    break;
                case "5": // SAIR
                    
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
