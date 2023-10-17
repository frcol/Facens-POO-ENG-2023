package aula9_relacionamento;

import java.util.ArrayList;


public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> lstPets;
    
    public Tutor() {
        lstPets = new ArrayList<>();
    }
    
    public Tutor(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pet> getLstPets() {
        return lstPets;
    }
    
    public void addPet(Pet pet) {
        lstPets.add(pet);
    }
    
    public Pet getPet(int index) {
        return lstPets.get(index);
    }
    
    public void removePet(Pet pet) {
        lstPets.remove(pet);
    }
    
    public void removePet(int index) {
        lstPets.remove(index);
    }
    
    public String imprimir() {
        String str = "\nNome: "+nome+
                      "\nCPF: "+cpf;
        
        for (Pet petTmp : lstPets) {
            str += petTmp.imprimir();
        }
        
        return str;
    }
}
