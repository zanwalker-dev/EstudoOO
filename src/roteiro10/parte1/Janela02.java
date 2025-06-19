package roteiro10.parte1;

import javax.swing.JFrame;

public class Janela02 extends JFrame {
    private int largura = 300;
    private int altura = 300;

    public Janela02() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setVisible(true);
    }
}
