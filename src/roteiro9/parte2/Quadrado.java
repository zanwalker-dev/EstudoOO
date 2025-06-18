package roteiro9.parte2;

public class Quadrado implements FiguraGeometrica {

    private double lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }
}
