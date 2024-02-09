package Questão05;

import java.util.Scanner;

public class ReverterNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de três dígitos no formato CDU: ");
        int cdu = scanner.nextInt();

        int unidade = cdu % 10; // Extrai a unidade do número
        int dezena = (cdu / 10) % 10; // Extrai a dezena do número
        int centena = cdu / 100; // Extrai a centena do número

        int ucd = unidade * 100 + dezena * 10 + centena; // Reescreve o número no formato UCD

        System.out.println("O número " + cdu + " reescrito no formato UCD é " + ucd);
    }
}

