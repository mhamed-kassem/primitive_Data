import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseMover extends JFrame {


    private MouseMover(){
        setLayout(new GridLayout(2,5,5,5));

        JButton button = new JButton("Start");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }


    public static class event implements ActionListener{
        public void actionPerformed(ActionEvent e){

            try{
                Robot rob = new Robot();
                for (int x=0; x<=30;x++){
                    rob.mouseMove((int)(Math.random()*500),(int)(Math.random()*500));
                    rob.delay(1000);
                }

            }catch (AWTException ex){
                System.exit(0);
            }

        }
    }


    public static void main(String[] args){
        MouseMover gui = new MouseMover();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200,200);
        gui.setVisible(true);
        gui.setTitle("Mouse Mover");

    }


}
