import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 12/10/2016.
 */
public class array_list {
    public static void main(String[] arg){
        List<String>list=new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state=list.get(1);
        System.out.println("the second element is "+state);

        int pos=list.indexOf("Alaska");
        System.out.println("index of Alaska is "+pos);

        System.out.println("\n Array list iterator ");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String value=iterator.next();
            System.out.println(value);
        }

        System.out.println("\n Array list foreach");
        for (String value:list) {
            System.out.println(value);
        }

        System.out.println("\n Java 8 method reference");
        list.forEach(System.out::println);

    }
}