package roteiro6.parte2;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Hora;
    public int getHora() { return hora;}
    public void setHora(int hora) {
        this.hora = hora;
    }

    //Minuto;
    public int getMinuto() { return minuto;}
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    //Segundo;
    public int getSegundo() { return segundo;}
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
