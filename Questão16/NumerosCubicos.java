package Questão16;

public class NumerosCubicos {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int centena = i / 100;
            int dezena = (i % 100) / 10;
            int unidade = i % 10;
            int somaCubos = (int) (Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));

            if (somaCubos == i) {
                System.out.println(i);
            }
        }
    }
}
