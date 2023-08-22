package aula2;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        String nome = "Fabio";
        
        /*System.out.print("Teste");
        //sout
        System.out.println("Teste 2");
        
        System.out.print("Não pula linha");
        System.out.println("Pula linha");
        System.out.printf("Formata %s", nome);
        
        // Concatenar
        System.out.println("Nome: "+nome+" !");
        */
        
        char sexo = 'm';
        String sobreNome = "Colombini";
        
        float valor = 100.44f;
        double saldo = 100.44;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva seu nome:");
        String var1 = scan.next();
        
        /*System.out.println("Voce escreveu "+var1);
        
        System.out.println("Idade:");
        int idade = scan.nextInt();
        
        System.out.println("Sua \nidade e "+idade);
        */
        
        boolean aprovado = var1.equals("Fabio");
        System.out.println(aprovado);
        
        // conventer String em Inteiro
        String idadeStr = "50";
        int idade1 = Integer.parseInt(idadeStr);
             
        String valorStr = "100.55";
        float valor1 = Float.parseFloat(valorStr);
        
        // < > == !=
        // && || !
        if (idade1 != 18) {
            
        } if (idade1 < 18)  {
        
        } else {
            
        }
        
        String option = "2";
        
        /*switch (var1) {
            case var1:
                
                break;
            default:
                throw new AssertionError();
        }*/
        
        
        for (int i=0; i < 10; i++) {
            System.out.println(i);
        }
        
        boolean ready = true;
        while(ready) {
            System.out.println("");
            
            ready = false;
        }
        
        do {
            // .........
            if (3 < 5) {
                ready = false;
            }   
        } while(ready);
        
        
        int[] arIdades = {3,6,8,10};
        
        System.out.println(arIdades[2]);
        arIdades[1] = 9;
        
        String[] arNomes = new String[5];
        arNomes[0] = "Fabio";
    }  
}
