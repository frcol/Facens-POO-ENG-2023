package aula9;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Tutor tut = new Tutor("Fabio", "2342342");
        
        Pet pet1 = new Pet("Stefanni", "Lhasa", 17);
        Pet pet2 = new Pet("Ozzy", "Shitzu", 4);
        Pet pet3 = new Pet("Snape", "Corn Snake", 5);
        
        tut.addPet(pet1);
        tut.addPet(pet2);
        tut.addPet(pet3);
        
        JOptionPane.showMessageDialog(null, tut.imprimir());
    }
}
