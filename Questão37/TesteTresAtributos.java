package Questão37;

public class TesteTresAtributos {
    public static void main(String[] args) {
        TresAtributos<Integer> tresInteiros = new TresAtributos<>(1, 2, 3);
        System.out.println("Quantidade de atributos iguais: " + tresInteiros.quantosSaoIguais());
        tresInteiros.imprimir();

        TresAtributos<String> tresStrings = new TresAtributos<>("A", "B", "B");
        System.out.println("Quantidade de atributos iguais: " + tresStrings.quantosSaoIguais());
        tresStrings.imprimir();

        TresAtributos<Double> tresDoubles = new TresAtributos<>(2.5, 5.5, 2.5);
        System.out.println("Quantidade de atributos iguais: " + tresDoubles.quantosSaoIguais());
        tresDoubles.imprimir();
    }
}
