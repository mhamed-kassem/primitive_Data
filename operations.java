/**
 * Created by user on 23/09/2016.
 */
public class operations {
    public static void main(String[] args){

        int intvalue1=95;
        int intvalue2=65;
        double result=intvalue1+intvalue2;
        System.out.println("addition: "+result);

        result=intvalue1-intvalue2;
        System.out.println("subtraction: "+result);

        result=intvalue1*intvalue2;
        System.out.println("multiplication: "+result);

        result=(double)intvalue1/intvalue2;
        System.out.println("dividing: "+result);

        result=intvalue1%intvalue2;
        System.out.println("reminder: "+result);

        double doublevalue=-3.5568525;
        long rounded=Math.round(doublevalue);
        System.out.println("rounded: "+rounded);
        double absvalue=Math.abs(doublevalue);
        System.out.println("Absolute: "+absvalue);
    }
}
