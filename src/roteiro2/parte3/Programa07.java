package roteiro2.parte3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Programa07 {

    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();

        while (true) {
            System.out.println("Nota: ");
            int nota = entrada.nextInt();

            if (nota < 0) {
                break;
            }
            notas.add(nota);
            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        if (!notas.isEmpty()) {
            double soma = 0;
            for (int n : notas) {
                soma += n;
            }
            double media = soma / notas.size();

            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        System.out.println("Encerrado");
        entrada.close();
    }
}
