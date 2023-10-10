
package aula7_ac1;


public class Veterinario {
    private String nome;
    private String crmv;
    private char genero;
    private double valorConsulta;

    public Veterinario() {
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    public double calculaSalario(int qtdeConsultas) {
        return valorConsulta * qtdeConsultas;
    }
    
    public String imprimir() {
        return "\n\n======================="+
                "\nNome: "+nome+
                "\nCRMV: "+crmv+
                "\nGenero: "+genero+
                "\nValor Consulta: "+valorConsulta;
    }
    
    public String imprimir(int qtdeConsultas) {
        String str = "\n\n======================="+
                "\nNome: "+nome+
                "\nCRMV: "+crmv+
                "\nGenero: "+genero+
                "\nValor Consulta: "+valorConsulta+
                "\nSalário: "+calculaSalario(qtdeConsultas);
        
        return str;
    }
}
