import javax.swing.JFrame;

public class framesPanelsA {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Meu primeiro frame em Java");
        PainelA meuPainel = new PainelA();

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(meuPainel);
        janela.setSize(600,400);
        janela.setVisible(true);

    }


}
