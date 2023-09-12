package aula5;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String imprimir() {
        return  "\n==============\n"+
                "\nRa: "+getRa()+
                "\nNome: "+getNome()+
                "\nCurso: "+getCurso();
    }
}
