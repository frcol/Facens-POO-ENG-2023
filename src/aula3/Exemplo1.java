package aula3;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.println("Num 1");
        num1 = scan.nextInt();
        
        System.out.println("Num 2");
        num2 = scan.nextInt();
        
        int ResultTmp = Soma(num1,num2);
        System.out.println("Resultado = "+Soma(num1, num2));
        
        if (Soma(num1, num2) > 5) {
            
        }
        
        System.out.println("Subtracao ="+Subtracao(num1,num2));
    }
    
    public static int Soma(int value1, int value2) {
        int resultado = value1+value2;
        
        return resultado;
    }
    
    public static int Subtracao(int value1, int value2) { 
        int resultado = value1-value2;
        
        return resultado;
    }
}
