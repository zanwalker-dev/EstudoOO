package roteiro8.parte1;

public class VeiculoPasseio extends Veiculo {
    private int qtdeMaxPassageiros;

    public VeiculoPasseio(String modelo, int qtdeMaxPassageiros) {
        super(modelo);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public int getQtdeMaxPassageiros() {
        return qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) {
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }
}
