package aula10.Exercicio1;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("Ozzy");
        
        Gato cat = new Gato();
        cat.setNome("Sol");
        
        Capivara cap = new Capivara();
        cap.setNome("Sebastiao");
        
        ArrayList<Animal> lstAnimal = new ArrayList<>();
        lstAnimal.add(dog);
        lstAnimal.add(cat);
        lstAnimal.add(cap);
        
        //Animal animal = new Animal();   
        //((Cachorro)animal).getVelocidade(); <--- Erro
        
        Animal animal1 = new Gato("Shirlei", 5, 4);
        ((Gato)animal1).getAlturaSalto();
        
        for (Animal ani : lstAnimal) {
            if (ani instanceof Gato) {
                ((Gato) ani).getAlturaSalto();
            }      
        }      
    }
}
