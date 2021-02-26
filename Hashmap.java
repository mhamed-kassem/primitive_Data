package com.example.java;

import java.util.*;

/**
 * Created by user on 12/10/2016.
 */
public class Hashmap {
    public static void main(String[] arg){
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        System.out.println(map);

        map.put(5,"five");
        System.out.println(map);

        String cap=map.get(3);
        System.out.println("the string value of 3 is "+cap);

        map.remove(4);
        System.out.println(map);

        System.out.println("\n hashmap iterator");
        Set<Integer>keys=map.keySet();
        Iterator<Integer>iterator1=keys.iterator();
        while(iterator1.hasNext()){
            int key=iterator1.next();
            System.out.println("the String data of "+key+" is "+map.get(key));
        }

        System.out.println("\n hashmap foreach");
        for (int key:keys){
            System.out.println("the String data of "+key+" is "+map.get(key));

        }
    }
}
