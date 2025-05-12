package roteiro4.parte4;

import java.text.Normalizer;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno01 = new Aluno();

        System.out.println("Digite o numero de matricula do aluno: ");
        aluno01.setMatricula(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Digite o nome do aluno: ");
        aluno01.setNome(entrada.nextLine());

        System.out.println("Digite o curso do aluno: ");
        aluno01.setCurso(entrada.nextLine());

        System.out.println("Digite o ano ingresso do aluno: ");
        aluno01.setAnoIngresso(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Digite a situação do aluno: ");
        String situacaoEntrada = entrada.nextLine();
        String situacaoNormalize = Normalizer.normalize(situacaoEntrada, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}", "");
        aluno01.setSituacao(situacaoNormalize);

        System.out.println("Digite a quantidade de disciplinas do aluno: ");
        aluno01.setQtdeDisciplina(entrada.nextInt());

        System.out.println("Aluno 01");
        System.out.println("Matrícula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Situação : " + aluno01.getSituacao());
        System.out.println("Quantidade de Disciplinas : " + aluno01.getQtdeDisciplina());

    }
}
