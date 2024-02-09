package Questão36;

public class TesteRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico("João", 20, "Engenharia de Software");
        RegistroAcademico r2 = new RegistroAcademico("Maria", 19, "Ciência da Computação");
        RegistroAcademico r3 = new RegistroAcademico("Pedro", 21, "Sistemas de Informação");
        
        System.out.println("Número de matrículas: " + RegistroAcademico.numeroDeMatriculas);
        System.out.println(r1.getMatricula() + " - " + r1.getNome() + " - " + r1.getIdade() + " - " + r1.getCurso());
        System.out.println(r2.getMatricula() + " - " + r2.getNome() + " - " + r2.getIdade() + " - " + r2.getCurso());
        System.out.println(r3.getMatricula() + " - " + r3.getNome() + " - " + r3.getIdade() + " - " + r3.getCurso());
    }
}
