package exercicios;

import java.util.Scanner;

/**
 * @author Hebert Souza
 * @since 2025-19-07
 * @version 0.1
 */

public class AreaCircureferencia {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a Área da Circunferência? Informe o raio: "); 
        double raio = teclado.nextDouble();
        final double PI = 3.14159;

        double area = PI * raio * raio;

        // Forma correta de exibir a área com unidade
        System.out.printf("A área é: %.2f Metros%n", area);

        teclado.close();
    }
}
