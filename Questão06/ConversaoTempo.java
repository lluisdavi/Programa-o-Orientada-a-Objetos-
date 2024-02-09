package Questão06;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o intervalo em minutos: ");
        int minutos = scanner.nextInt();

        int dias = minutos / 1440; // 1 dia tem 1440 minutos
        int horas = (minutos % 1440) / 60; // 1 hora tem 60 minutos
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalem a " + dias + " dias, " + horas + " horas e " + minutosRestantes + " minutos.");
    }
}
