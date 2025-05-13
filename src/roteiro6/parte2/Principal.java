package roteiro6.parte2;

public class Principal {

    public static void main(String[] args) {

        Tempo horaInicio = new Tempo(10, 15, 2);

        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio);



        System.out.println("Numero de origem : " + lig01.getNumOrigem());
        System.out.println("Numero de destino : " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de inicio : " + lig01.getHoraInicio());
        Tempo inicio = lig01.getHoraInicio();
        System.out.println("Hora de inicio : " +
                String.format("%02d:%02d:%02d", inicio.getHora(), inicio.getMinuto(), inicio.getSegundo()));


    }

}
