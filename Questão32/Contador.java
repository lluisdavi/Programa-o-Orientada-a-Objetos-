package Questão32;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public void imprimir() {
        System.out.println("Valor atual do contador: " + this.valor);
    }
}
