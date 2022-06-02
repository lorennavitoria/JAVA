package Calculadora;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel { // como já está estendendo JPanel, eu não preciso criar (JPanel j = new JPanel();)

    private JTextField txtNumber;



    public TextPanel(){ // construtor

        setLayout(new FlowLayout());
        txtNumber = new JTextField(15);
        txtNumber.setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.setEnabled(false); // para evitar que o usuario digite na caixa de texto, ele só vai poder usar os botões
        add(txtNumber); //adicionando no Panel


    }

    public JTextField getTxtNumber() {
        return txtNumber;
    }
}
