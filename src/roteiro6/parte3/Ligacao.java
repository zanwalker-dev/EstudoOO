package roteiro6.parte3;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    //Número de Origem;
    public String getNumOrigem() { return numOrigem; }
    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    //Número de Destino;
    public String getNumDestino() { return numDestino; }
    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    //Local de Origem
    public String getLocalOrigem() { return localOrigem; }
    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    //Local de Destino
    public String getLocalDestino() { return localDestino; }
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    //Hora de inicio;
    public Tempo getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Tempo horaInicio) {}

    //Hora fim;
    public Tempo getHoraFim() { return horaFim; }
    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    public String verificaNumero(String numero) {
        if (numero.equals(numOrigem)) {
            return "Número é o de origem da ligação.";
        } else if (numero.equals(numDestino)) {
            return "Número é o de destino da ligação.";
        } else {
            return "Número não faz parte da ligação.";
        }
    }

    public double calcularValorLigacao() {
        if (horaFim == null) {
            return 0.0;
        }

        int duracaoMinutos = horaInicio.diferencaEmMinutos(horaFim);
        return duracaoMinutos * 1.0; // R$1,00 por minuto
    }

    public double calcularValorMinutoCheio() {
        if (horaFim == null) {
            return 0.0;
        }

        int segundosInicio = horaInicio.getHora() * 3600 + horaInicio.getMinuto() * 60 + horaInicio.getSegundo();
        int segundosFim = horaFim.getHora() * 3600 + horaFim.getMinuto() * 60 + horaFim.getSegundo();

        int duracaoSegundos = Math.abs(segundosFim - segundosInicio);

        int minutosCobrados = (int) Math.ceil(duracaoSegundos / 60.0);

        return minutosCobrados * 1.0;
    }
}
