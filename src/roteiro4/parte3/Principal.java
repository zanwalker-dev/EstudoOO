package roteiro4.parte3;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "José",
                "Sistema de Informação", 2019);

        aluno01.setMatricula(222);

        Aluno aluno02 = new Aluno(222, "Maria",
                "Ciencia da Computação", 2020);
        aluno02.setMatricula(333);

        System.out.println("Aluno 01");
        System.out.println("Matrícula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());

        System.out.println();

        System.out.println("Aluno 02");
        System.out.println("Matrícula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano Ingresso : " + aluno02.getAnoIngresso());

    }
}
