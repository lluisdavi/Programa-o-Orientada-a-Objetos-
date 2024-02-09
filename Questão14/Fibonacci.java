package Questão14;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();

        int anterior = 0, atual = 1, proximo;

        System.out.print("Série de Fibonacci até o " + n + "-ésimo termo: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
