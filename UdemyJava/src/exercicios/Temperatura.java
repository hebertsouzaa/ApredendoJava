package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Convertendo Celsius para Kelvin");
        System.out.print("Informe o Celsius:");
        String c = teclado.next();
        String d = c.concat("º");
        double cwithgraus = Double.parseDouble(c);

        double k = cwithgraus + 273.15;

        System.out.printf("O valor de %s em Kelvin é %.2fK%n",d,k);
        teclado.close(); 


    }
}
