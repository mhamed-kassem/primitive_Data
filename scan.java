import java.util.Scanner;

/**
 * Created by user on 25/09/2016.
 */
public class scan {
    public static void main(String[] args){

        String str1 ="Hello";
        String str2 ="world";
        String str3 =str1+","+str2+"!";
        System.out.println(str3);

        StringBuilder sb=new StringBuilder("Hello")
            .append(",")
            .append("world")
            .append("!");
        System.out.println(sb);

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter value: ");
        String input=scanner.nextLine();
        System.out.println(input);

        sb.delete(0,sb.length());
        for (int i = 0; i <4 ; i++) {
            input=scanner.nextLine();
            sb.append(input+"\n");
        }
        System.out.println(sb);
    }
}
