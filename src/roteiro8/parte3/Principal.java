package roteiro8.parte3;

public class Principal {
    public static void main(String[] args) {
        VeiculoPequeno v01 = new VeiculoPequeno("ABC-1234", 2020, "moto");
        VeiculoPasseio v02 = new VeiculoPasseio("DEF-5678", 2019, 4);
        VeiculoCarga v03 = new VeiculoCarga("GHI-9012", 2018, 3000);

        Cliente cliente1 = new Cliente("123.456.789-00", "João Silva", "Rua A, 123", "joao@email.com", "(11) 9999-8888");

        cliente1.setVeiculo(v01);
        System.out.println("=== Teste com Veículo Pequeno ===");
        exibirDadosClienteEPedagio(cliente1);

        cliente1.setVeiculo(v02);
        System.out.println("\n=== Teste com Veículo de Passeio ===");
        exibirDadosClienteEPedagio(cliente1);

        cliente1.setVeiculo(v03);
        System.out.println("\n=== Teste com Veículo de Carga ===");
        exibirDadosClienteEPedagio(cliente1);
    }

    private static void exibirDadosClienteEPedagio(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF/CNPJ: " + cliente.getCpf_cnpj());
        System.out.println("Veículo: " + cliente.getVeiculo().getClass().getSimpleName());
        System.out.println("Placa: " + cliente.getVeiculo().getPlaca());
        System.out.printf("Valor do pedágio: R$ %.2f%n", cliente.calcularPagamentoPedagio());
    }
}