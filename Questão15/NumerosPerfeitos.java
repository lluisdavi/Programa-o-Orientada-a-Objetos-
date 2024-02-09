package Questão15;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        int numero = 1;
        int somaDivisores;

        System.out.println("Os 4 primeiros números perfeitos são:");

        while (true) {
            somaDivisores = 0;

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero);
            }

            if (numero == 10000) {
                break;
            }

            numero++;
        }
    }
}
