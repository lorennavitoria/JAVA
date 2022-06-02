import javax.swing.*;
import java.awt.event.ActionEvent;

public class EscreverBomDiaAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {

        //aqui que eu vou escrever o código que será execultado quando uma determinada ação ocorrer



        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(100,100);
        frame.setTitle("Bom Dia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JLabel l = new JLabel();
        l.setText("Bom dia Usuário!!!");
        frame.add(l);



    }
}
