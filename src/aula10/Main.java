package aula10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno alu = new Aluno("231", 6, 5, "Joao", "345345");
        
        Professor prof = new Professor("Fabio", "3454", "111");
        prof.setTipoVinculo('N');
        prof.setSalario(125000);
        
        //System.out.println(alu.imprimir());
        //System.out.println(prof.imprimir());
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(alu);
        lstPessoas.add(prof);
        
        for (Pessoa pessoa : lstPessoas) {
            System.out.println(pessoa.imprimir());
        }
        
        Pessoa p = new Pessoa("FAbio", "23123");
        Aluno a = (Aluno)p;
        System.out.println(a.imprimir());
    }
}
