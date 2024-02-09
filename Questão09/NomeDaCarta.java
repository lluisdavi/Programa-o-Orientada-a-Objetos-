package Questão09;

import java.util.Scanner;

public class NomeDaCarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da carta (de 1 a 13): ");
        int valor = scanner.nextInt();

        System.out.print("Digite o naipe da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipe = scanner.nextInt();

        String nomeValor;

        switch (valor) {
            case 1:
                nomeValor = "ás";
                break;
            case 2:
                nomeValor = "dois";
                break;
            case 3:
                nomeValor = "três";
                break;
            case 4:
                nomeValor = "quatro";
                break;
            case 5:
                nomeValor = "cinco";
                break;
            case 6:
                nomeValor = "seis";
                break;
            case 7:
                nomeValor = "sete";
                break;
            case 8:
                nomeValor = "oito";
                break;
            case 9:
                nomeValor = "nove";
                break;
            case 10:
                nomeValor = "dez";
                break;
            case 11:
                nomeValor = "valete";
                break;
            case 12:
                nomeValor = "dama";
                break;
            case 13:
                nomeValor = "rei";
                break;
            default:
                nomeValor = "inválido";
                break;
        }

        String nomeNaipe;

        switch (naipe) {
            case 1:
                nomeNaipe = "ouros";
                break;
            case 2:
                nomeNaipe = "paus";
                break;
            case 3:
                nomeNaipe = "copas";
                break;
            case 4:
                nomeNaipe = "espadas";
                break;
            default:
                nomeNaipe = "inválido";
                break;
        }

        System.out.println("A carta é " + nomeValor + " de " + nomeNaipe + ".");
    }
}
