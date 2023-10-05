package aula8_ArrayList_JOpion;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //String nome = JOptionPane.showInputDialog("Entre com o nome:");
        //String tmpIdade = JOptionPane.showInputDialog("Idade: ");
        //int idade = Integer.parseInt(tmpIdade);
        
        //System.out.println("Idade: "+idade);
        
        /*Object[] itens = { "MAÇA", "PERA", "BANANA" };
        Object selectedValue = JOptionPane.showInputDialog(null,
            "Escolha um item",
            "Opçao",
            JOptionPane.QUESTION_MESSAGE, 
            null, itens, itens[0]);
        
        System.out.println("Item selecionado: "+selectedValue);*/
        
        JOptionPane.showMessageDialog(null, "Minha mensagem", 
                "Meu Titulo",
                JOptionPane.ERROR_MESSAGE);
    }
}
