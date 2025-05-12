package roteiro4.parte1;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "José";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 222;
        aluno02.nome = "Maria";
        aluno02.curso = "Ciencia da Computação";
        aluno02.anoIngresso = 2020;

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
