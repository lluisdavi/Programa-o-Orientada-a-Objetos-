package Questão35;

public class MaiorNumero {

    public static int maior(int a, int b) {
        return a > b ? a : b;
    }

    public static int maior(int a, int b, int c) {
        int maiorAB = maior(a, b);
        return maior(maiorAB, c);
    }

    public static int maior(int a, int b, int c, int d) {
        int maiorABC = maior(a, b, c);
        return maior(maiorABC, d);
    }

    public static double maior(double a, double b) {
        return a > b ? a : b;
    }

    public static double maior(double a, double b, double c) {
        double maiorAB = maior(a, b);
        return maior(maiorAB, c);
    }

    public static double maior(double a, double b, double c, double d) {
        double maiorABC = maior(a, b, c);
        return maior(maiorABC, d);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        double maiorABCD = maior(a, b, c, d);
        return maior(maiorABCD, e);
    }
}
