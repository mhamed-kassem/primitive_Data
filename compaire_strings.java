/**
 * Created by user on 25/09/2016.
 */
import java.text.NumberFormat;
import java.util.Locale;
public class compaire_strings {
    public static void main(String[] args){
        String str1="Hello";
        String str2="Hello";

        if (str1==str2){
            System.out.println("they match");
            }else
            System.out.println("they don`t match");

        String str3="hello";

        if (str1==str3){
            System.out.println("they match");
        }else
            System.out.println("they don`t match");

        String part1="Hello ";
        String part2="world";
        String str4=part1+part2;
        String str5="hello world";

        if (str4.equals(str5)){
            System.out.println("they match and have the same case");
        }else if (str4.equalsIgnoreCase(str5)) {
            System.out.println("they match but don`t same case");
        }else
            System.out.println("they don`t match");


        Locale locale=new Locale("ar","EG"); //language  -- country

        double doublevalue=12_345_7.89;
        NumberFormat numf=NumberFormat.getNumberInstance();
        System.out.println("number: "+numf.format(doublevalue));

        NumberFormat curf=NumberFormat.getCurrencyInstance();
        System.out.println("currency: "+curf.format(doublevalue));

        NumberFormat intf=NumberFormat.getIntegerInstance();
        System.out.println("integer: "+intf.format(doublevalue));


    }
}
