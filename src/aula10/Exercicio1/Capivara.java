
package aula10.Exercicio1;


public class Capivara extends Animal {
    private int peso;

    public Capivara() {
    }

    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String fala() {
        return "Capivara: Falando como um Capivara";
    }

    @Override
    public String imprimir() {
       return "\n\n#### CAPIVARA ####"
               +super.imprimir()
                +"\nPeso: "+peso;
    }
}
