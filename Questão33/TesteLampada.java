package Questão33;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        System.out.println("Antes de acender a lâmpada:");
        lampada.mostraEstado();
        System.out.println("Número de acionamentos: " + lampada.getNumeroAcionamentos());
        
        lampada.acende();
        
        System.out.println("Depois de acender a lâmpada:");
        lampada.mostraEstado();
        System.out.println("Número de acionamentos: " + lampada.getNumeroAcionamentos());
        
        lampada.apaga();
        
        System.out.println("Depois de apagar a lâmpada:");
        lampada.mostraEstado();
        System.out.println("Número de acionamentos: " + lampada.getNumeroAcionamentos());
    }
}
