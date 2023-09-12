package aula5;

public class ContaBancaria {
    private int id;
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double value) {
        saldo += value;
    }
    
    public void sacar(double value) {
        if (value <= saldo) {
            saldo -= value;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
