package Aula12;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        System.out.println(conta1.getTotalContas());
        
        Conta conta2 = new Conta();
        System.out.println(conta1.getTotalContas());
        
        System.out.println(Conta.getTotalContasStatic());
    }
}
