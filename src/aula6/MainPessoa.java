package aula6;

public class MainPessoa {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente("Fabio", 50);
        Cliente cli2 = new Cliente("Joao", 34, "Harry Potter", 15);
        
        cli1.emprestar("Diario sobre a cegueira", 30);
        
        System.out.println(cli1.imprimir());
        
        cli1.devolver();
        
        System.out.println(cli1.imprimir());
    }
}
