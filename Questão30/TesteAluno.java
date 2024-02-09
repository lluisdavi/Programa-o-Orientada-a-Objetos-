package Questão30;

public class TesteAluno {
    public static void main(String[] args) {
        // Criação dos objetos da classe Aluno
        Aluno aluno1 = new Aluno(123, "João", 7.5, 8.0, 9.0);
        Aluno aluno2 = new Aluno(456, "Maria", 6.0, 5.5, 8.0);
        Aluno aluno3 = new Aluno(789, "Pedro", 5.0, 6.0, 7.5);

        // Impressão dos resultados para cada aluno
        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Média final: " + aluno1.media());
        System.out.println("Precisa de " + aluno1.provaFinal() + " na prova final");
        System.out.println();

        System.out.println("Aluno 2: " + aluno2.getNome());
        System.out.println("Média final: " + aluno2.media());
        System.out.println("Precisa de " + aluno2.provaFinal() + " na prova final");
        System.out.println();

        System.out.println("Aluno 3: " + aluno3.getNome());
        System.out.println("Média final: " + aluno3.media());
        System.out.println("Precisa de " + aluno3.provaFinal() + " na prova final");
        System.out.println();
        }


        }
