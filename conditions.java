import java.util.Scanner;

/**
 * Created by user on 01/10/2016.
 */
public class conditions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        String input =sc.nextLine();
        int month=Integer.parseInt(input);

        switch (month){
            case 1:
                System.out.println("the month is january");
                break;
            case 2:
                System.out.println("the month is february");
                break;
            default:
                System.out.println("you chose another month");

        }
    }
}
