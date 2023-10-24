
package aula10.Exercicio1;


public class Gato extends Animal{
    private int alturaSalto;

    public Gato() {
    }

    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    @Override
    public String fala() {
        return "Gato: Miaumiaumiau";
    }

    @Override
    public String imprimir() {
        return "\n\n#### GATO ####"
                +super.imprimir()
                +"\nAltura salto: "+alturaSalto;
    }
}
