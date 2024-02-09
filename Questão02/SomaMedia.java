package Questão02;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double soma = num1 + num2 + num3;
        double media = soma / 3;

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média aritmética dos três números é: " + media);
    }
}
