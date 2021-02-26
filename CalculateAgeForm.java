
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeForm extends JFrame {

    private JLabel label;
    // private JTextField textField;
    private JTextField year;
    private JTextField month;
    private JTextField day;

    private CalculateAgeForm(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

       /*
        ImageIcon image1 = new ImageIcon(getClass().getResource("icon.jpg"));
        JLabel labelIcon = new JLabel(image1);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 10;
        c.gridheight = 5;
        add(labelIcon,c);
       */

        JLabel title = new JLabel("Date of birth  ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 6;
        add(title,c);



       // textField = new JTextField(15);
       // add(textField);
        year = new JTextField(10);
        month = new JTextField(10);
        day = new JTextField(10);

        JLabel tYear = new JLabel("Year:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        add(tYear,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 3;
        add(year,c);

        JLabel tMonth = new JLabel("Month:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 8;
        add(tMonth,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 10;
        c.gridwidth = 3;
        add(month,c);

        JLabel tDay = new JLabel("Day:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 8;
        add(tDay,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 10;
        c.gridwidth = 3;
        add(day,c);

        JButton button = new JButton("click me");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 12;
        c.gridwidth =4;
        add(button,c);

        button.addActionListener(e -> {
            //String text = textField.getText();
            //label.setText(text+".");
            //if (!sday.isEmpty()&&!smonth.isEmpty()&&!syear.isEmpty())

            try {
                LocalDate now = LocalDate.now();
                //System.out.println(now.toString());

                LocalDate ld = LocalDate.of(Integer.parseInt( year.getText()), Integer.parseInt( month.getText()), Integer.parseInt(day.getText()));
                //System.out.println(ld);
                //System.out.println("--------------");

                int boundedYears = now.compareTo(ld);
                Period age = ld.until(now);
                label.setText(age.getYears() + "year, " + age.getMonths() + "month, " + age.getDays() + "day" + "~= " + boundedYears);

            }catch (Exception ex){
                label.setText("Please enter a valid date!");
            }

        });

        label = new JLabel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 15;
        add(label,c);

    }



    public static void main(String[]args){
        CalculateAgeForm gui = new CalculateAgeForm();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,200);
        gui.setVisible(true);
        gui.setTitle("calculate Age");
    }
}
