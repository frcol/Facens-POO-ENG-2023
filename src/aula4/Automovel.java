package aula4;

public class Automovel {
    String marca;
    String modelo;
    int ano;
    double velocidade;
    
    public void andar() {
        velocidade += 10;
    }
    
    public void freiar() {
        velocidade -= 10;
    }
}
