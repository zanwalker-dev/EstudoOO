package roteiro6.parte1;

public class Principal {

    public static void main(String[] args) {

        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", "10:15:02");
        //Professor usei overload pra responder o quinto item, o sexto não encontrei forma de calcular.
        Ligacao lig02 = new Ligacao("121212", "565656", "A", "B", "10:15:02", "10:20:35");

        System.out.println("Numero de origem : " + lig01.getNumOrigem());
        System.out.println("Numero de destino : " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de inicio : " + lig01.getHoraInicio());

        System.out.println();

        System.out.println("Numero de origem : " + lig02.getNumOrigem());
        System.out.println("Numero de destino : " + lig02.getNumDestino());
        System.out.println("Local de origem: " + lig02.getLocalOrigem());
        System.out.println("Local de destino: " + lig02.getLocalDestino());
        System.out.println("Hora de inicio : " + lig02.getHoraInicio());
        System.out.println("Hora do final da ligação : " + lig02.getHoraFim());

    }

}
