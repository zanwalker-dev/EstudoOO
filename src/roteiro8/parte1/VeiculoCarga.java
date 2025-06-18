package roteiro8.parte1;

public class VeiculoCarga extends Veiculo {
    private int pesoMax;

    public VeiculoCarga(String modelo, int pesoMax) {
        super(modelo);
        this.pesoMax = pesoMax;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
}
