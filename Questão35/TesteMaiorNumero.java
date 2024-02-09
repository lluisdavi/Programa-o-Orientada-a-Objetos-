package Questão35;

public class TesteMaiorNumero {

    public static void main(String[] args) {
        int a = 3, b = 8, c = 12, d = 5;
        double x = 2.5, y = 6.7, z = 8.2, w = 4.1, v = 7.9;

        System.out.println("Maior de 2 inteiros: " + MaiorNumero.maior(a, b));
        System.out.println("Maior de 3 inteiros: " + MaiorNumero.maior(a, b, c));
        System.out.println("Maior de 4 inteiros: " + MaiorNumero.maior(a, b, c, d));
        System.out.println("Maior de 2 doubles: " + MaiorNumero.maior(x, y));
        System.out.println("Maior de 3 doubles: " + MaiorNumero.maior(x, y, z));
        System.out.println("Maior de 4 doubles: " + MaiorNumero.maior(x, y, z, w));
        System.out.println("Maior de 5 doubles: " + MaiorNumero.maior(x, y, z, w, v));
    }
}
