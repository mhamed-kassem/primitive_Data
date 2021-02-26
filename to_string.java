package com.example.java;

/**
 * Created by user on 25/09/2016.
 */
import java.text.NumberFormat;
public class to_string {
    public static void main(String[] args){

        int intvalue=42;
        String fromint=Integer.toString(intvalue);
        System.out.println(fromint);
        boolean booleanvalue=true;
        String fromboolean=Boolean.toString(booleanvalue);
        System.out.println(fromboolean);
        long longvalue=200_00_00;
        NumberFormat formatter =NumberFormat.getNumberInstance();
        String formatted =formatter.format(longvalue);
        System.out.println(formatted);

    }
}
