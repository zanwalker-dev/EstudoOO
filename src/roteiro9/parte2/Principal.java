package roteiro9.parte2;

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

        Circulo circulo = new Circulo(3);
        System.out.println("\n=== TESTE DO CÍRCULO ===");
        System.out.println("Nome da figura: " + circulo.getNomeFigura());
        System.out.println("Raio: " + circulo.getRaio());
        System.out.printf("Área: %.2f%n", circulo.getArea());
        System.out.printf("Perímetro: %.2f%n", circulo.getPerimetro());

        circulo.setRaio(5.5);
        System.out.println("\nApós modificar o raio para 5.5:");
        System.out.printf("Área: %.2f%n", circulo.getArea());
        System.out.printf("Perímetro: %.2f%n", circulo.getPerimetro());
    }
}
