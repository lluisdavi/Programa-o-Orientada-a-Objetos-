package Questão03;

import java.util.Scanner;

public class AnguloTrigonometrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double angulo = scanner.nextDouble();

        // Convertendo o ângulo de graus para radianos
        double anguloRad = Math.toRadians(angulo);

        // Calculando as funções trigonométricas
        double seno = Math.sin(anguloRad);
        double cosseno = Math.cos(anguloRad);
        double tangente = Math.tan(anguloRad);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        // Exibindo os resultados na tela
        System.out.println("Ângulo em radianos: " + anguloRad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);
    }
}
