
package aula13;

import aula10.Exercicio1.Animal;

public class Morcego extends Animal implements IVoador{

    @Override
    public String fala() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void voa() {
        System.out.println("Animal morcego vaondo");
    }
    
}
