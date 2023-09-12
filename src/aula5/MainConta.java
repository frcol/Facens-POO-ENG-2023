package aula5;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(1000);
        System.out.println("Saldo: "+conta.getSaldo());
        
        conta.sacar(100);
        System.out.println("Saldo: "+conta.getSaldo());
        
        conta.sacar(1000);
        System.out.println("Saldo: "+conta.getSaldo());
    }
}
