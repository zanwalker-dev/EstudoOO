package roteiro5.parte2;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    public Loja(String nomeFantasia, String cnpj){
        this(nomeFantasia, nomeFantasia, cnpj);
    }

    //Nome fantasia;
    public String getNomeFantasia() { return nomeFantasia;}
    public void setNomeFantasia(String nomeFantasia) {this.nomeFantasia = nomeFantasia;}

    //Razão Social;
    public String getRazaoSocial() { return razaoSocial;}
    public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}

    //CNPJ;
    public String getCnpj() { return cnpj;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    //Valor de Faturamento;
    public double getValorFat() {return valorFat;}
    public void setValorFat(double valorFat) {this.valorFat = valorFat;}

    //Area;
    public double getArea() { return area;}
    public void setArea(double area) {this.area = area;}

    //Nome do Proprietário;
    public String getNomeProprietario() { return nomeProprietario;}
    public void setNomeProprietario(String nomeProprietario) {this.nomeProprietario = nomeProprietario;}
}
