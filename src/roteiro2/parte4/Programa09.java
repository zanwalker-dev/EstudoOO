package roteiro2.parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorNotas = new int[5];
        int cont = 0;

        System.out.println("Informe uma nota entre 0 a 10");

        while(cont < 5){
            System.out.println("Nota: " + (cont + 1) + ":");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10){
                vetorNotas[cont] = nota;
                cont++;
            } else {
                System.out.println("Insira apenas notas de 0 a 10");
            }
        }
        System.out.println("Notas : "+Arrays.toString(vetorNotas));

        entrada.close();
    }
}