package Questão32;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();

        c.imprimir(); // Imprime: "Valor atual do contador: 0"
        c.incrementar();
        c.imprimir(); // Imprime: "Valor atual do contador: 1"
        c.incrementar();
        c.imprimir(); // Imprime: "Valor atual do contador: 2"
        c.zerar();
        c.imprimir(); // Imprime: "Valor atual do contador: 0"
    }
}
