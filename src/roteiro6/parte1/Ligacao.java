package roteiro6.parte1;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horaInicio;
    private String horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio, String horaFim) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Overload chamando o outro construtor e passando horaFim como vazio
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio) {
        this(numOrigem, numDestino, localOrigem, localDestino, horaInicio, "");
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
    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) {}

    //Hora fim;
    public String getHoraFim() { return horaFim; }
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}
