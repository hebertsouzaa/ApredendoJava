package fundamentos;

public class TiposPrimitivos {
    /**
     * @author:Hebert souza
     * @since:14/07/2025
     * 
     */
    public static void main(String[] args) {
        System.out.println("Tipos Primitivos");
        System.err.println("Números Inteiros");
        byte idade = 13;
        short populacao = 10000;
        int numero = 342;
        long saldo = 10000000000L;

        System.out.println("Números com ponto flutuantes");
        float altura = 1.66F;
        double pi = 3.13434;

        char letra = 'B'; //char usar aspas simples
        String nome = "Hebert"; //string usar aspas duplas


        boolean ativo = true;

        System.out.printf("idade: %d população: %d número: %d saldo na conta:%d pi: %d letra: %s nome: %s", idade,populacao,numero,saldo);

    }
}
