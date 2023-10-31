
package aula12;


public class Conta {
    private static int totalContas; // pertence a Classe e nao ao Objeto;
    
    public Conta() {
        totalContas++;
    }
    
    public int getTotalContas() {
        return totalContas;
    }
    
    public static int getTotalContasStatic() {
        return totalContas;
    }
}
