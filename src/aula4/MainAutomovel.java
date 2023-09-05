package aula4;

public class MainAutomovel {
    public static void main(String[] args) {
       Automovel auto1 = new Automovel();
       auto1.ano = 1945;
       auto1.marca = "Wolkswagem";
       auto1.modelo = "Fusca";
       
       Automovel auto2 = new Automovel();
       auto2.ano = 2022;
       auto2.marca = "Hyundai";
       auto2.modelo = "Creta";
       
       auto2.andar();
       System.out.println("Velocidade do auto2:"+auto2.velocidade);
       auto2.andar();
       System.out.println("Velocidade do auto2:"+auto2.velocidade);
       
        System.out.println("Velocidade do auto1:"+auto1.velocidade);
    }
}
