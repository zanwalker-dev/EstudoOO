package roteiro2.parte2;

import javax.swing.*;

public class Programa03 {

    public static void main(String[] args) {

        // System.out.println("Informe seu nome");

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        // System.out.println("Nome informado: " + nome);
        JOptionPane.showMessageDialog(null, "Nome informado : " + nome);

        // System.out.println("Informe sua idade");

        String strIdade = JOptionPane.showInputDialog("Informe sua idade");
        int idade = Integer.parseInt(strIdade);
        // System.out.println("Idade informada: " + idade);
        JOptionPane.showMessageDialog(null, "Idade informada : " + idade);

    }

}
