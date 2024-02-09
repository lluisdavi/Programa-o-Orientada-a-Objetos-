package Questão11;

import java.util.Scanner;

public class PosicaoPontos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe as coordenadas do primeiro ponto:");
        System.out.print("x1 = ");
        int x1 = input.nextInt();
        System.out.print("y1 = ");
        int y1 = input.nextInt();

        System.out.println("Informe as coordenadas do segundo ponto:");
        System.out.print("x2 = ");
        int x2 = input.nextInt();
        System.out.print("y2 = ");
        int y2 = input.nextInt();

        if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro.");
        } else if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro.");
        } else {
            System.out.println("O segundo ponto está na mesma posição do primeiro em relação ao eixo x.");
        }

        if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro.");
        } else if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro.");
        } else {
            System.out.println("O segundo ponto está na mesma posição do primeiro em relação ao eixo y.");
        }
    }
}
