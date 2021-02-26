

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarClass extends JFrame {

    private final JLabel label;
    private int counter=0;


    private MenuBarClass() {
        setLayout(new GridLayout(3,2));

        JMenuBar menuBare = new JMenuBar();
        setJMenuBar(menuBare);

        JMenu file = new JMenu("File");
        menuBare.add(file);

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        event ex = new event();
        exit.addActionListener(ex);


        JButton button = new JButton("Click 1");
        add(button);

        label = new JLabel("label 1");
        add(label);

        JButton button2 = new JButton("Click 2");
        add(button2);

        JLabel label2 = new JLabel("label 2");
        add(label2);

        JButton button3 = new JButton("Click 3");
        add(button3);

        JLabel label3 = new JLabel("label 3");
        add(label3);

        JButton button4 = new JButton("Click 4");
        add(button4);

        JLabel label4 = new JLabel("label 4");
        add(label4);


        button.addActionListener(e->{
            Toolkit.getDefaultToolkit().beep();
            counter++;
            label.setText(counter+" t");
        });

    }


    public static class event implements ActionListener{
        public void actionPerformed (ActionEvent e){
            System.exit(0);
        }
    }


    public static void main(String[]args){
        MenuBarClass gui = new MenuBarClass();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("program");
        gui.pack();
        gui.setVisible(true);
    }


}
