package Questão30;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double trabalho;

    // Construtor da classe Aluno
    public Aluno(int matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    // Método para calcular a média final do aluno
    public double media() {
        double mediaProvas = (nota1 + nota2) / 2.0;
        double mediaFinal = (mediaProvas * 2.5 + trabalho * 2.0) / 4.5;
        return mediaFinal;
    }

    // Método para calcular quanto o aluno precisa na prova final
    public double provaFinal() {
        double mediaFinal = media();
        if (mediaFinal >= 5.0 && mediaFinal < 7.0) {
            // Se a média final está entre 5 e 7, o aluno precisa da prova final para passar
            return Math.ceil(10.0 - mediaFinal);
        } else {
            // Se a média final é maior ou igual a 7 ou menor que 5, o aluno não precisa da prova final
            return 0.0;
        }
    }

    // Métodos getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
}
