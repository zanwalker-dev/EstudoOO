package roteiro10.parte3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaBorderLayout_v2 extends JFrame {

    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout V2");
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

        this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnDireita.setBackground(Color.gray);
        this.pnCentro.setBackground(Color.green);

        iniciarCabecalho();
        iniciarRodape();
        iniciarCentro();

        this.add(pnCabecalho, BorderLayout.PAGE_START);  // Topo (Norte)
        this.add(pnRodape, BorderLayout.PAGE_END);     // Base (Sul)
        this.add(pnEsquerda, BorderLayout.LINE_START);  // Esquerda (Oeste)
        this.add(pnDireita, BorderLayout.LINE_END);    // Direita (Leste)
        this.add(pnCentro, BorderLayout.CENTER);       // Centro
    }

    public void iniciarCabecalho() {
        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.pnCabecalho.add(new JLabel("Curso"));
        this.pnCabecalho.add(new JTextField(10));

        this.pnCabecalho.add(new JLabel("Observações"));
        this.pnCabecalho.add(new JTextField(25));
    }

    public void iniciarRodape() {
        this.pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.pnRodape.add(new JButton("Botão 04"));
        this.pnRodape.add(new JButton("Botão 05"));
    }

    public void iniciarCentro() {
        this.pnCentro.setLayout(new GridLayout(3, 2));

        this.pnCentro.add(new JLabel("Matricula"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Nome"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Idade"));
        this.pnCentro.add(new JTextField());
    }
}