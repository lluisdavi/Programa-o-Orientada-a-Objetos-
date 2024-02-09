package Questão33;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contadorDeAcionamentos;
    
    public Lampada() {
        this.estadoDaLampada = false;
        this.contadorDeAcionamentos = new Contador();
    }
    
    public void acende() {
        this.estadoDaLampada = true;
        this.contadorDeAcionamentos.incrementar();
    }
    
    public void apaga() {
        this.estadoDaLampada = false;
    }
    
    public void mostraEstado() {
        System.out.println("A lâmpada está " + (this.estadoDaLampada ? "acesa" : "apagada"));
    }
    
    public boolean estaLigada() {
        return this.estadoDaLampada;
    }
    
    public int getNumeroAcionamentos() {
        return this.contadorDeAcionamentos.getValor();
    }
}
