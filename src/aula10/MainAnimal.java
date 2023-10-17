package aula10;

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
        
        for (Animal animal : lstAnimal) {
            animal.fala();
        }
                
    }
}
