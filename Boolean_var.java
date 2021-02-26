/**
 * Created by user on 23/09/2016.
 */
public class Boolean_var {
    static boolean bdef;
    public static void main(String[] args){
        boolean var1=true;
        boolean var2=false;
        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);
        System.out.println("boolean default: "+bdef);

        boolean b3=!var1;
        System.out.println("b3: "+b3);

        int il=0;
        boolean b4=(il!=0);
        System.out.println("b4: "+b4);

        String sboolean="true";
        boolean parsed=Boolean.parseBoolean(sboolean);
        System.out.println("parsed: "+parsed);


    }
}
