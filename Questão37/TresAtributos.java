package Questão37;

public class TresAtributos<T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public TresAtributos(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int quantosSaoIguais() {
        int qtdIguais = 0;
        if (atributo1.equals(atributo2)) {
            qtdIguais++;
        }
        if (atributo1.equals(atributo3)) {
            qtdIguais++;
        }
        if (atributo2.equals(atributo3)) {
            qtdIguais++;
        }
        return qtdIguais;
    }

    public void imprimir() {
        System.out.println(atributo1 + " " + atributo2 + " " + atributo3);
    }
}
