package aula10.Exercicio1;


public class Cachorro extends Animal{

    private int velocidade;

    public Cachorro() {
    }

    public Cachorro(String nome, int idade, int velocidade) {
        super(nome, idade);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
    public String fala() {
        return "Cachorro: Auauauauu";
    }   

    @Override
    public String imprimir() {
        return "\n\n#### CACHORRO ####"
                +super.imprimir()
                +"\nVelocidade: "+velocidade;
    }
    
    
}
