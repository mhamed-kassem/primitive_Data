/**
 * Created by user on 26/09/2016.
 */
public class string_class {
    public static void main(String[] args){
        String s1="welcome to java world";
        System.out.println("length of string"+s1.length());

        int postion=s1.indexOf("java");
        System.out.println("position of substring: "+postion);

        String sub=s1.substring(11);
        System.out.println(sub);

        String s2="welcome!      ";
        int len1=s2.length();
        System.out.println(len1);
        String s3=s2.trim();
        System.out.println(s3.length()+" is length of string: "+s3);

    }
}
