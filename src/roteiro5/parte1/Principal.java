package roteiro5.parte1;

public class Principal {
    public static void main(String[] args) {
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");

        System.out.println("Nome fantasia : " + loja01.getNomeFantasia());
        System.out.println("Razão Social : " + loja01.getRazaoSocial());
        System.out.println("CNPJ : " + loja01.getCnpj());
        System.out.println("Valor de faturamento : " + loja01.getValorFat());
        System.out.println("Área : " + loja01.getArea());
        System.out.println("Nome do Proprietário : " + loja01.getNomeProprietario());

        System.out.println();

        System.out.println("Nome fantasia : " + loja02.getNomeFantasia());
        System.out.println("Razão Social : " + loja02.getRazaoSocial());
        System.out.println("CNPJ : " + loja02.getCnpj());
        System.out.println("Valor de faturamento : " + loja02.getValorFat());
        System.out.println("Área : " + loja02.getArea());
        System.out.println("Nome do Proprietário : " + loja02.getNomeProprietario());

    }
}
