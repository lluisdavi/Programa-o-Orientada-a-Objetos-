package Questão29;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("0001", "Mouse", 3, 20.0);
        Fatura fatura2 = new Fatura("0002", "Teclado", -2, -30.0);

        System.out.println("Fatura 1:");
        System.out.println("Número de identificação: " + fatura1.getNumeroIdentificacao());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade comprada: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço unitário: " + fatura1.getPrecoUnitario());
        System.out.println("Valor total: " + fatura1.calculaTotal());

        System.out.println("\nFatura 2:");
        System.out.println("Número de identificação: " + fatura2.getNumeroIdentificacao());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade comprada: " + fatura2.getQuantidadeComprada());
        System.out.println("Preço unitário: " + fatura2.getPrecoUnitario());
        System.out.println("Valor total: " + fatura2.calculaTotal());
    }
}
