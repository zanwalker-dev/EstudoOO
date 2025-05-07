package roteiro1.parte2;

public class Exercicio01 {
    public static void main(String[] args) {
        double sb = 2500;
        int numHorasExtra = 10;

        double valorHora = sb / 160;

        double valorHorasExtras = numHorasExtra * valorHora;

        double salarioTotal = sb + valorHorasExtras;

        System.out.println("Salario base : " + sb);
        System.out.println("Valor por hora:" + valorHora);
        System.out.println("Valor das horas extras:" + valorHorasExtras);
        System.out.println("Salário total:" + salarioTotal);
    }
}
