package roteiro2.parte4;

// Tentando resolver desafio de mostrar notas acima da média

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Programa07Desafio {

    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();

        while (true) {
            System.out.println("Nota: ");
            int nota = entrada.nextInt();

            if (nota < 0) {
                break;
            }

            if (nota > 10) {
                System.out.println("Apenas notas de 0 a 10.");
                continue;
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

            double oficialMedia = 7;

            int acimaDaMedia = 0;
            for (int n : notas) {
                if (n > oficialMedia) {
                    acimaDaMedia++;
                }
            }
            System.out.println("Notas total: " + notas.size());
            System.out.println("Média das notas: " + media);
            System.out.println("Notas acima da média: " + acimaDaMedia);

        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        System.out.println("Encerrado");
        entrada.close();
    }
}
