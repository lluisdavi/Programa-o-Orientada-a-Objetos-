package Questão12;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o número do dia: ");
    int dia = input.nextInt();

    // Variável que representa o dia da semana (0 = domingo, 1 = segunda, etc.)
    int diaSemana = 0;

    // Incrementa o dia da semana a cada dia
    for (int i = 1; i < dia; i++) {
      diaSemana++;
      if (diaSemana == 7) {
        diaSemana = 0;
      }
    }

    // Array com os nomes dos dias da semana
    String[] diasDaSemana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};

    // Imprime o dia da semana correspondente ao número informado
    System.out.println("O dia " + dia + " será uma " + diasDaSemana[diaSemana] + ".");
  }
}
