package roteiro2.parte4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args){

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner entrada = new Scanner(System.in);
        int palpite;

        System.out.println("Advinhe o número secreto entre 1 e 100.");

        while(true) {
            System.out.println("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou o número secreto! - " + numeroSecreto);
                break;
            }else if (palpite < numeroSecreto ){
                System.out.println("Mire mais alto! O numero secreto é MAIOR do que esse");

            } else {
                System.out.println("Mire mais baixo! O numero secreto é MENOR do que esse");
            }

        }
        entrada.close();

    }
}
