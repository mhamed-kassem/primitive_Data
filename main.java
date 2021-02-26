/**
 * Created by user on 19/09/2016.
 */
import java.math.BigDecimal;
public class main {
    public static void main(String[] args){

        double value =.012;
        double psum=value+value+value;
        System.out.println("psum: "+psum);

        String strvalue = Double.toString(value);
        System.out.println(+value);
        System.out.println("strvalue: "+strvalue);
        BigDecimal bigvalue=new BigDecimal(strvalue);
        BigDecimal bsum=bigvalue.add(bigvalue).add(bigvalue);
        System.out.println("sum of BigDecimals: "+bsum);


    }
}
