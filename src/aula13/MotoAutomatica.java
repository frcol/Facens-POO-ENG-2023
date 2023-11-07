
package aula13;


public class MotoAutomatica extends moto implements IAutomatico{

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Moto mudando marcha automaticamente");
    }
    
}
