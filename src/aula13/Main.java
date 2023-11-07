package aula13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IAutomatico> lstVeiculosAutomaticos = new ArrayList<>();
        
        CarroAutomatico car = new CarroAutomatico();
        MotoAutomatica moto = new MotoAutomatica();
        
        lstVeiculosAutomaticos.add(car);
        lstVeiculosAutomaticos.add(moto);
        
        lstVeiculosAutomaticos.get(0).mudaMarchaAutomaticamente();
    
        ArrayList<IVoador> lstVoadores = new ArrayList<>();
        Morcego mor = new Morcego();
        Aviao avi = new Aviao();
        
        lstVoadores.add(mor);
        lstVoadores.add(avi);
        
        for (IVoador voador : lstVoadores) {
            voador.voa();
        }
    }
}
