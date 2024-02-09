package Questão28;

public class TesteTime {
    public static void main(String[] args) {
        
        Time time = new Time("Flamengo");
        System.out.println("Time:" + time);

        System.out.println("Vitorias:" + time.getVitorias());
        System.out.println("Gols Marcados:" +time.getGolsMarcados());

    }
}
