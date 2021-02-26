import sun.text.bidi.BidiBase;

/**
 * Created by user on 02/10/2016.
 */
public class methods {

   static String[] months={"January","February","March",
           "April","may","june",
           "july","August","september",
           "october","November","December"};
    public static void main(String[] args){
        loopit("months of year");
        loopit("second run time");
        loopit("third run time");

    }
    static void loopit(String label){
        System.out.println(label);
        for (int i = 0; i <label.length() ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }
    }

}
