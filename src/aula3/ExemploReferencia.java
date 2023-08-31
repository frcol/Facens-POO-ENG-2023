package aula3;

import java.util.Arrays;

public class ExemploReferencia {
    public static void main(String[] args) {
        String[] nomes = {"Fabio", "Joao" };
        String[] copiaNomes = Arrays.copyOf(nomes, nomes.length);
        
        //String[] copiaNomes = nomes;
        //String[] copiaNomes = new String[2];
        //copiaNomes = nomes;
        
        System.out.println(copiaNomes[0]);
        //copiaNomes[0] = "Chico";
        alteraVetor(copiaNomes);
        System.out.println(nomes[0]);
    }
    
    public static void alteraVetor(String[] _nomes) {
        _nomes[0] = "Chico";
    }
}
