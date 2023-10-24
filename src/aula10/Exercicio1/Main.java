package aula10.Exercicio1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        String str = "";
        
        while (true) {
            String escolha = JOptionPane.showInputDialog("Menu:\n" +
                    "1- Cadastrar\n" +
                    "2- Mostrar todos\n" +
                    "3- Animal falando\n" +
                    "4- Sair");
            if (escolha == null) {
                System.exit(0);
            }
            
            int opcao = Integer.parseInt(escolha);

            switch (opcao) {
                case 1:
                    String tipoAnimal = JOptionPane.showInputDialog("Qual animal deseja cadastrar?\n" +
                            "1- Cachorro\n" +
                            "2- Gato\n" +
                            "3- Capivara");

                    String nome = JOptionPane.showInputDialog("Nome do animal:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal:"));

                    switch (tipoAnimal) {
                        case "1":
                            int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Velocidade do cachorro:"));
                            listaAnimais.add(new Cachorro(nome, idade, velocidade));
                            break;
                        case "2":
                            int alturaSalto = Integer.parseInt(JOptionPane.showInputDialog("Altura do salto do gato:"));
                            listaAnimais.add(new Gato(nome, idade, alturaSalto));
                            break;
                        case "3":
                            int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso da capivara:"));
                            listaAnimais.add(new Capivara(nome, idade, peso));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    if (listaAnimais.isEmpty()) {
                        continue;
                    }
                    
                    str = "";
                    for (Animal animal : listaAnimais) {
                        str += animal.imprimir();
                    }
                    JOptionPane.showMessageDialog(null, str);
                    break;

                case 3:
                    if (listaAnimais.isEmpty()) {
                        continue;
                    }
                    
                    str = "";
                    for (Animal animal : listaAnimais) {
                        str += animal.fala()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, str);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Adeus!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
