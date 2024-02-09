package Questão04;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertendo Celsius para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibindo o resultado na tela
        System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit);
    }
}
