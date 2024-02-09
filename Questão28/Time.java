package Questão28;

public class Time {
    private String nome;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;
    
    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getPontos() {
        return pontos;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public int getGolsMarcados() {
        return golsMarcados;
    }
    
    public int getGolsSofridos() {
        return golsSofridos;
    }
    
    public void registrarVitoria(int golsMarcados, int golsSofridos) {
        this.pontos += 3;
        this.vitorias++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }
    
    public void registrarEmpate(int golsMarcados, int golsSofridos) {
        this.pontos += 1;
        this.empates++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }
    
    public void registrarDerrota(int golsMarcados, int golsSofridos) {
        this.derrotas++;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }
    
    public int getSaldoGols() {
        return golsMarcados - golsSofridos;
    }
    
    public String toString() {
        return nome + " - Pontos: " + pontos + ", Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas + ", Gols Marcados: " + golsMarcados + ", Gols Sofridos: " + golsSofridos + ", Saldo de Gols: " + getSaldoGols();
    }
}
