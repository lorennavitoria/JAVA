import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Formulario {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Janela");
        f.setSize(300,200);
        f.setLocation(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando a janela for fechada pelo usuario, a aplicação termina

        JPanel p = new JPanel();

        JLabel l = new JLabel("Digite seu nome:");
        p.add(l);

        JTextField t = new JTextField(10);
        p.add(t);

        JButton b = new JButton("OK");
        BotaoAction action = new BotaoAction(t);
        b.addActionListener(action);
        p.add(b);









        f.add(p);
        f.setVisible(true);//para que a janela possa ser vísivel/ser visualizada. Pois, eu acho, que por padrão, a visibilidade esta bloqueada, entao tem que desbloquear

    }
}
