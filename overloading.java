import java.util.Scanner;

/**
 * Created by user on 02/10/2016.
 */
public class overloading {
    public static void main(String[] args){
        String s1=getinput("Enter value1 : ");
        String s2=getinput("Enter value2 : ");
        String s3=getinput("enter value3 : ");

        double result=addvalues(s1,s2);
        System.out.println("result of 2 values is: "+result);

        double result2=addvalues(s1,s2,s3);
        System.out.println("result of 3 values is: "+result2);

        double result3=addvalues(s1,s2,s3,s1,s2,s3,s2);
        System.out.println("result of many values is: "+result3);


    }

    static String getinput(String prompt){
        System.out.print(prompt);
        Scanner sc=new Scanner(System.in);

        return sc.nextLine();
    }


    static double addvalues(String s1,String s2){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);

        return d1+d2;
    }


    static double addvalues(String s1,String s2,String s3){
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        double d3=Double.parseDouble(s3);

        return d1+d2+d3;
    }


    static double addvalues(String...values){
        double result = 0;
        for (String value:values) {
            double d=Double.parseDouble(value);
            result+=d;
        }

        return result;
    }

}
