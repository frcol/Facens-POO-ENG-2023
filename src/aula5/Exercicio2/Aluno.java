
package aula5.Exercicio2;


public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    public Aluno(String ra, String nome, float ac1, float ac2) {
       this.ra = ra;
       this.nome = nome;
       this.ac1 = ac1;
       this.ac2 = ac2;
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    
    public float calcularMedia(){
        return (ac1 * 0.15f) + (ac2 * 0.30f) +(ag * 0.10f) +(af * 0.45f);
    }
    
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else { 
            return "Reprovado";
        }
    }
    
    public String imprimir() {
        String result = "RA:"+ra
                +"\nNome: "+getNome()
                +"\nAC1: "+getAc1()
                +"\nAC2: "+getAc2()
                +"\nAG: "+getAg()
                +"\nAF: "+getAf()
                +"\n --------------------------"
                +"\nMédia: "+calcularMedia()
                +"\nSituação: "+verificarAprovacao();
        return result;
    }
}
