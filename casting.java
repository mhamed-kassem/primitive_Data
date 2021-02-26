/**
 * Created by user on 20/09/2016.
 */
public class casting {
    public static void main(String[] args){
        int intvalue1=85;
        int intvalue2=intvalue1;
        System.out.println("the 2end value is:"+intvalue2 );

        long longvalue1=intvalue1;
        System.out.println("long value is: "+longvalue1);

        short shortvalue1= (short) intvalue1;
        System.out.println("short value is: "+shortvalue1);

        int intvalue3=1024;
        System.out.println("int value 3 is: "+intvalue3);
        byte bytevalue1= (byte) intvalue3;
        System.out.println("byte value is: "+bytevalue1);

        double doublevalue1=intvalue3;
        double doublevalue2=5.99558;
        int intvalue4= (int) doublevalue2;
        System.out.println("double value 1 is: "+doublevalue1);
        System.out.println("int value 4 is: "+intvalue4);
        System.out.println("good work wish to you good life");
    }
}
