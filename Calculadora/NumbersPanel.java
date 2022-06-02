package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersPanel extends JPanel implements ActionListener {

    private JTextField txtText;


    public NumbersPanel(JTextField txtText){
        this.txtText = txtText;

        setLayout(new GridLayout(4,3)); // como se fosse jpanel.setLayout(...)


        JButton btn1 = new JButton("1");
        add(btn1);
        btn1.addActionListener(this);// ao inves de criar outra classe só pra criar os codigos dentro dele, eu posso fazer isso aqui mesmo dentro da mesma classe usando o this


        JButton btn2 = new JButton("2");
        add(btn2);
        btn1.addActionListener(this);


        JButton btn3 = new JButton("3");
        add(btn3);
        btn1.addActionListener(this);


        JButton btn4 = new JButton("4");
        add(btn4);
        btn1.addActionListener(this);


        JButton btn5 = new JButton("5");
        add(btn5);
        btn1.addActionListener(this);


        JButton btn6 = new JButton("6");
        add(btn6);
        btn1.addActionListener(this);


        JButton btn7 = new JButton("7");
        add(btn7);
        btn1.addActionListener(this);


        JButton btn8 = new JButton("8");
        add(btn8);
        btn1.addActionListener(this);


        JButton btn9 = new JButton("9");
        add(btn9);
        btn1.addActionListener(this);

        JButton btnEmpty1 = new JButton();
        btnEmpty1.setEnabled(false); //desabilita o botão
        add(btnEmpty1);

        JButton btn0 = new JButton("0");
        add(btn0);
        btn1.addActionListener(this);

        JButton btnEmpty2 = new JButton();
        btnEmpty2.setEnabled(false);
        add(btnEmpty2);



    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(txtText.getText().length() ==10){
            return;
        }

        JButton btn = (JButton) e.getSource();//retorna pra gente qual foi o botão que foi disparado
        String number = btn.getText();
        txtText.setText(txtText.getText() + number);
    }
}
