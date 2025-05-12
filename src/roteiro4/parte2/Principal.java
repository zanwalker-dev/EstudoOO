package roteiro4.parte2;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "José",
                "Sistema de Informação", 2019);

        Aluno aluno02 = new Aluno(222, "Maria",
                "Ciencia da Computação", 2020);

        System.out.println("Aluno 01");
        System.out.println("Matrícula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);

        System.out.println();

        System.out.println("Aluno 02");
        System.out.println("Matrícula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);

    }
}
