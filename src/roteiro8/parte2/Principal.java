package roteiro8.parte2;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos dos diferentes tipos de veículos
        Veiculo v01 = new Veiculo("11111-BA", 2010);
        VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
        VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
        VeiculoPequeno v04 = new VeiculoPequeno("44444-BA", 2013, "moto");

        // Testando modificação e exibição dos dados
        System.out.println("=== Veículo Genérico ===");
        System.out.println("Placa: " + v01.getPlaca());
        System.out.println("Ano: " + v01.getAnoFabricacao());

        // Modificando dados do veículo genérico
        v01.setPlaca("99999-BA");
        v01.setAnoFabricacao(2015);
        System.out.println("\nDados modificados:");
        System.out.println("Placa: " + v01.getPlaca());
        System.out.println("Ano: " + v01.getAnoFabricacao());

        System.out.println("\n=== Veículo de Carga ===");
        System.out.println("Placa: " + v02.getPlaca());
        System.out.println("Ano: " + v02.getAnoFabricacao());
        System.out.println("Peso Máximo: " + v02.getPesoMax() + " kg");

        // Modificando dados do veículo de carga
        v02.setPesoMax(6000);
        System.out.println("\nPeso máximo modificado: " + v02.getPesoMax() + " kg");

        System.out.println("\n=== Veículo de Passeio ===");
        System.out.println("Placa: " + v03.getPlaca());
        System.out.println("Ano: " + v03.getAnoFabricacao());
        System.out.println("Passageiros: " + v03.getQtdeMaxPassageiros());

        // Modificando dados do veículo de passeio
        v03.setQtdeMaxPassageiros(7);
        System.out.println("\nPassageiros modificado: " + v03.getQtdeMaxPassageiros());

        System.out.println("\n=== Veículo Pequeno ===");
        System.out.println("Placa: " + v04.getPlaca());
        System.out.println("Ano: " + v04.getAnoFabricacao());
        System.out.println("Modelo: " + v04.getModelo());

        // Modificando dados do veículo pequeno
        v04.setModelo("bicicleta motorizada");
        System.out.println("\nModelo modificado: " + v04.getModelo());
    }
}