package Questão19;

public class FatorialRecursivo {
    public static int fatorial(int n) {
        System.out.println(n + "! = " + (n <= 1 ? 1 : n) + " (chamada com n = " + n + ")");
        if (n <= 1) {
            return 1;
        } else {
            int f = n * fatorial(n - 1);
            System.out.println("\t" + (n - 1) + "! = " + f + " (retorno da chamada com n = " + (n - 1) + ")");
            return f;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int resultado = fatorial(n);

        System.out.println("O fatorial de " + n + " é " + resultado);
    }
}
