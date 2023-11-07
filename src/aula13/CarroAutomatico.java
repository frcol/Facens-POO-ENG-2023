/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author fabio
 */
public class CarroAutomatico extends Carro implements IAutomatico{

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Carro Mudando marcha automaticamente");
    }
    
}
