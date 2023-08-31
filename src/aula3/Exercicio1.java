package aula3;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Resultado: "+Calcula(2, 5, '+'));
    }

    public static int Calcula(int x, int y, char operador) {
        int resultado = 0;

        switch (operador) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = x / y;
                break;
        }

        return resultado;
    }
}
