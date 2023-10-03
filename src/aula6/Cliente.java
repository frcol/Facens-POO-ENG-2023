package aula6;

public class Cliente {
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;

    public Cliente() {
    }

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente(String nome, int idade, String livro, int diasDevolucao) {
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    public void emprestar(String livro) {
        this.livro = livro;
    }
    
    public void emprestar(String livro, int dias) {
        this.livro = livro;
        this.diasDevolucao = dias;
    }
    
    public void devolver() {
        this.livro = null;
        this.diasDevolucao = 0;
    }
    
    public String imprimir() {
        return "Nome: "+nome+
                "\nIdade: "+idade+
                "\nLivro: "+livro+
                "\nDias para devolver: "+diasDevolucao;
    }
}
