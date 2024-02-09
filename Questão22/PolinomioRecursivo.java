package Questão22;

import java.util.Scanner;

public class PolinomioRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o grau do polinômio: ");
        int n = sc.nextInt();
        double[] coeficientes = new double[n+1];

        for (int i = 0; i <= n; i++) {
            System.out.printf("Digite o coeficiente a%d: ", n-i);
            coeficientes[i] = sc.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        double resultado = calcularPolinomio(n, coeficientes, x);
        System.out.printf("Pn(%.2f) = %.2f\n", x, resultado);

        sc.close();
    }

    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        if (n == 0) { // caso base
            return coeficientes[0];
        } else {
            return x * calcularPolinomio(n-1, coeficientes, x) + coeficientes[n];
        }
    }
}
