package Questão36;

public class RegistroAcademico {
    static int numeroDeMatriculas = 0;
    private int matricula;
    private String nome;
    private int idade;
    private String curso;
    
    public RegistroAcademico(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = ++numeroDeMatriculas;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
