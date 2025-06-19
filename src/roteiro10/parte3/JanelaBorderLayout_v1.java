package roteiro10.parte3;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaBorderLayout_v1 extends JFrame {
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");
        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.pnCabecalho = new JPanel();
        this.pnRodape = new JPanel();
        this.pnEsquerda = new JPanel();
        this.pnDireita = new JPanel();
        this.pnCentro = new JPanel();

        this.pnCabecalho.setBackground(Color.red);     // Vermelho para o cabeçalho
        this.pnRodape.setBackground(Color.blue);       // Azul para o rodapé
        this.pnEsquerda.setBackground(Color.yellow);   // Amarelo para a esquerda
        this.pnDireita.setBackground(Color.gray);      // Cinza para a direita
        this.pnCentro.setBackground(Color.green);      // Verde para o centro

        this.add(pnCabecalho, BorderLayout.PAGE_START);  // Topo (Norte)
        this.add(pnRodape, BorderLayout.PAGE_END);     // Base (Sul)
        this.add(pnEsquerda, BorderLayout.LINE_START);  // Esquerda (Oeste)
        this.add(pnDireita, BorderLayout.LINE_END);    // Direita (Leste)
        this.add(pnCentro, BorderLayout.CENTER);       // Centro
    }

}
