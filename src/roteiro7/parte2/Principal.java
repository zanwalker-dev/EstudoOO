package roteiro7.parte2;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("Cadastro de Alunos");
        System.out.println("************************");

        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            System.out.print("Ano de Ingresso: ");
            int anoIngresso = scanner.nextInt();
            scanner.nextLine();

            listaAlunos.set(i, new Aluno(matricula, nome, curso, anoIngresso));
        }

        System.out.println("\nListando os Alunos:");
        System.out.println("************************");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Matricula : " + listaAlunos.get(i).getMatricula());
            System.out.println("Nome : " + listaAlunos.get(i).getNome());
            System.out.println("Curso : " + listaAlunos.get(i).getCurso());
            System.out.println("Ano de ingresso : " + listaAlunos.get(i).getAnoIngresso());
            System.out.println("************************");
        }

        scanner.close();
    }
}