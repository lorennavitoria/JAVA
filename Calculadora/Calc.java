package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {

    public Calc() throws  Exception{

        /* para mim colocar um título eu posso fazer:

        assim:

         setTitle("Janela");

         ou assim: (desse jeito eu to chamando as linhas de código que já tem escrito no construtor da  classe mae/JFrame, que pede como parametro uma String (ou seja, ta pedindo o nome da janela) (eu chamo atraves do "super"):
        * O super invoca o construtor da super classe

        super("Calculadora");

        */

        super("Calculadora");

        //configurando o Look and Feel para ficar parecido com o tema Windows:
        // a classe que está o modelo do windows é essa: com.sun.java.swing.plaf.windows.WindowsLookAndFeel

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esta disendo ao Java que quando o usuário fechar a janela do frame (apertar o Alt+F4 ou clicar no X da janela), o programa Java deve terminar
        setSize(350,350);//tamanho da janela
        setLocation(400,200);//localizaçao da janela dentro do monitor do usuario



        /*
        Nas 3 linhas de código abaixo, eu estou criando um "painel" que ficará na parte de cima:

        linha 1: chamando o método setLayout (que fica dentro da classe JFrame), como se fosse assim: frame.setLayout.
        e passando como paramentro que eu quero o tipo BorderLayout().

        linha 2: // criando um objeto da classe criada (a classe TextPanel)

        linha 3: adicionando na janela JFrame um BorderLayout que ficará no norte da janela,
        e que dentro desse BorderLayout terá o objeto criado textPanel

        */

        setLayout(new BorderLayout());
        TextPanel textPanel = new TextPanel();
        add(BorderLayout.NORTH,textPanel);

        // Agora criará o painel que ficará na parte de baixo (mas será criando além deste painel, será criado um outro dentro dele (uma subdivisão):


        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new BorderLayout());
        // será criado agora dentro do painel criado, mais dois panels que será feito com Grade. Para isso eu preciso criar classes (vão ser chamadas: NumbersPanel e OperationsPanel)
        digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
        digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));
        add(BorderLayout.CENTER, digitsPanel);//adicionando na janela JFrame um BorderLayout que ficará no centro da janela,




























        setVisible(true);//para desbloquear a vizibilidade da janela, por padrao, ela vem bloqueada (parece que é isso)


    }

    public static void main(String[] args) throws Exception {
        // tudo que o método main faz é construir uma calculadora, o resto é feito tudo dentro do construtor da calculadora

        new Calc();

    }

}
