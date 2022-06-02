import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Forms {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Janela");
        f.setSize(300,200);
        f.setLocation(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JLabel l = new JLabel("Digite seu nome:");
        p.add(l);

        JTextField t = new JTextField(10);
        p.add(t);


        JButton b = new JButton("OK");
        //resumo: criação do objeto que irá fazer a escuta do evento:
        BotaoActionForms action = new BotaoActionForms(t); // este (o objeto action da classe BotaoAction) é quem está ouvindo o evento do botão
        //resumo: adiciona no botão b, o objeto (action) que faz a escuta . Entao, quando o botão for apertado, o método actionPerformed (que está dentro da classe BotaoActionForms)será invocado:
        b.addActionListener(action);//registrando o listener no botao b. Tem que registrar o listener para avisar ao Java quem é que está ouvindo o evento do botão
        p.add(b);







        f.add(p);
        f.setVisible(true);



    }

}
