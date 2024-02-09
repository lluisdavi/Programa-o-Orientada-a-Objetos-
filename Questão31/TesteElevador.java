package Questão31;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 10);
        
        System.out.println("Elevador no andar " + elevador.getAndarAtual());
        System.out.println("Capacidade: " + elevador.getCapacidade());
        System.out.println("Total de andares: " + elevador.getTotalAndares());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        
        elevador.entra();
        elevador.entra();
        elevador.entra();
        
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        
        elevador.sobe();
        elevador.sobe();
        
        System.out.println("Elevador no andar " + elevador.getAndarAtual());
        
        elevador.sai();
        
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        
        elevador.desce();
        
        }
        }
