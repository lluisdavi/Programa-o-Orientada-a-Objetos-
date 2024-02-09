package Questão29;

public class Fatura {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Fatura(String numeroIdentificacao, String descricao, int quantidadeComprada, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double calculaTotal() {
        return this.quantidadeComprada * this.precoUnitario;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }
}
