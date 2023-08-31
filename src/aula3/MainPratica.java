package aula3;

import java.util.Arrays;

public class MainPratica {
    public static void main(String[] args) {
        int[] myVet = { 3, 5, 7};
        System.out.println(myVet[0]);
        
        int[] myVetCop = new int[3];
        myVetCop = Arrays.copyOf(myVet, myVet.length);
        
        /*myVetCop[0] = 100;*/
        
        testFuncao(myVetCop);
                
        System.out.println(myVet[0]);
    }
    
    public static void testFuncao(int[] vetParametro) {
        vetParametro[0] = 100;
    }
}
