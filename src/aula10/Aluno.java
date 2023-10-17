
package aula10;

public class Aluno extends Pessoa {
    private String ra;
    private double nota1;
    private double nota2;
    
    public Aluno() {
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }  

    public Aluno(String ra, double nota1, double nota2) {
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String ra, double nota1, double nota2, String nome, String cpf) {
        super(nome, cpf);
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    @Override
    public String imprimir() {
        return  "\n#### ALUNO ###" 
                +super.imprimir()
                +"\nRA: "+ra
                +"\nNota1: "+nota1
                +"\nNota2: "+nota2;
    }  
}
