package Questão17;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * 0.035);
            populacaoB += (int) (populacaoB * 0.01);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população de A seja maior ou igual à população de B.");
    }
}
