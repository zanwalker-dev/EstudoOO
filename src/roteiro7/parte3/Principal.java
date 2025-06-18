package roteiro7.parte3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[3];

        System.out.println("Cadastro de Alunos e Disciplinas");
        System.out.println("********************************");

        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("\nCadastro do Aluno " + (i + 1) + ":");

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

            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);

            System.out.println("\nCadastro de Disciplinas (digite 'sair' para terminar):");
            while (true) {
                System.out.print("Nome da Disciplina: ");
                String disciplina = scanner.nextLine();

                if (disciplina.equalsIgnoreCase("sair")) {
                    break;
                }

                aluno.setDisciplina(disciplina);
            }

            listaAlunos[i] = aluno;
        }

        System.out.println("\nListagem Completa de Alunos:");
        System.out.println("********************************");
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());

            System.out.println("Disciplinas Matriculadas (" + aluno.getQtdeDisciplina() + "):");
            for (String disciplina : aluno.getListaDisciplinas()) {
                System.out.println(" - " + disciplina);
            }

            System.out.println("********************************");
        }

        scanner.close();
    }
}