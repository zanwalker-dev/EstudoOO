package roteiro6.parte3;

public class Principal {

    public static void main(String[] args) {

        Tempo horaInicio = new Tempo(10, 15, 2);

        Tempo ligInicio = new Tempo(10, 15, 0);
        Tempo ligFim = new Tempo(10, 45, 10);
        Ligacao lig02 = new Ligacao("123", "456", "A", "B", ligInicio);
        lig02.setHoraFim(ligFim);

        Tempo ligInicio2 = new Tempo(14, 30, 10);
        Tempo ligFim2 = new Tempo(14, 30, 30);

        Ligacao lig03 = new Ligacao("987", "654", "A", "B", ligInicio2);
        lig03.setHoraFim(ligFim2);

        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio);



        System.out.println("Numero de origem : " + lig01.getNumOrigem());
        System.out.println("Numero de destino : " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        Tempo inicio = lig01.getHoraInicio();
        System.out.println("Hora de inicio : " + String.format("%02d:%02d:%02d", inicio.getHora(), inicio.getMinuto(), inicio.getSegundo()));
        System.out.println();
        System.out.println("-----Testando os numeros --------");
        System.out.println(lig01.verificaNumero("121212"));
        System.out.println(lig01.verificaNumero("565656"));
        System.out.println(lig01.verificaNumero("000000"));

        System.out.println();

        System.out.println("----- Valor de ligação --------");
        System.out.printf("Valor da ligação: R$ %.2f", lig02.calcularValorLigacao());

        System.out.println();

        System.out.println("----- Valor de ligação valor cheio por minuto --------");
        System.out.println("Valor da ligação (minuto cheio): R$" + lig03.calcularValorMinutoCheio());
    }

}
