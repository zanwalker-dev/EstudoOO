package roteiro7.parte1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[3];

        System.out.println("Cadastro de Alunos");
        System.out.println("************************");

        for (int i = 0; i < listaAlunos.length; i++) {
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

            listaAlunos[i] = new Aluno(matricula, nome, curso, anoIngresso);
        }

        System.out.println("\nListando os Alunos:");
        System.out.println("************************");
        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("Matricula : " + listaAlunos[i].getMatricula());
            System.out.println("Nome : " + listaAlunos[i].getNome());
            System.out.println("Curso : " + listaAlunos[i].getCurso());
            System.out.println("Ano de ingresso : " + listaAlunos[i].getAnoIngresso());
            System.out.println("************************");
        }

        scanner.close();
    }
}