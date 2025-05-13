package roteiro6.parte3;

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

    //Duração em minutos;
    public int diferencaEmMinutos(Tempo outro) {
        int segundos1 = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int segundos2 = outro.hora * 3600 + outro.minuto * 60 + outro.segundo;

        int diferencaSegundos = Math.abs(segundos2 - segundos1);

        return (int) Math.ceil(diferencaSegundos / 60.0);
    }
}
