package utilities;

/**
 * Created by user on 14/10/2016.
 */
public class mathHelper {
    public static double add(String num1, String num2){

        double num_1=Double.parseDouble(num1);
        double num_2=Double.parseDouble(num2);
        return num_1+num_2;
    }

    public static double subtract(String num1, String num2){

        double num_1=Double.parseDouble(num1);
        double num_2=Double.parseDouble(num2);
        return num_1-num_2;    }

    public static double multiplication(String num1, String num2) {

        double num_1=Double.parseDouble(num1);
        double num_2=Double.parseDouble(num2);
        return num_1*num_2;
    }

    public static double dividing(String num1, String num2){

        double num_1=Double.parseDouble(num1);
        double num_2=Double.parseDouble(num2);
        return num_1/num_2;    }
}
