/**
 * Created by user on 23/09/2016.
 */
public class characters {
    public static void main(String[] args){
        char c1='1';
        char c2='2';
        char c3='3';
        char c4=4;
        System.out.println("char1: "+c1);
        System.out.println(""+c2);
        System.out.println(+c3);
        System.out.println(+c4);
        System.out.println("char4: "+c4);

        char dollarsign='\u0024';
        System.out.println("currency "+dollarsign);

        char a1='a';
        char a2='b';
        char a3='c';
        System.out.println(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        char[] chars={'H','e','l','l','o','!'};
        String s=new String(chars);
        System.out.println(s);

        String s1="short size : ";
        String s2="M";
        String s3=s1+s2+" , Qty: "+4;
        System.out.println(s3);

        String s4="hello!";
        char[] chars2=s4.toCharArray();
        for (char c :chars2){
            System.out.println(c);
        }

    }
}
