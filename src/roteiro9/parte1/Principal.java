package roteiro9.parte1;

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println("=== TESTE DO QUADRADO ===");
        System.out.println("Nome da figura: " + quadrado.getNomeFigura());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        quadrado.setLado(7.5);
        System.out.println("\nApós modificação:");
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("\n=== TESTE DO RETÂNGULO ===");
        System.out.println("Nome da figura: " + retangulo.getNomeFigura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());

        retangulo.setAltura(5.5);
        retangulo.setLargura(8);
        System.out.println("\nApós modificação:");
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
    }
}
