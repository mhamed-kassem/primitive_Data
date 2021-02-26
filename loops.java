/**
 * Created by user on 01/10/2016.
 */
public class loops {
    public static void main(String[] args){
        String[] months={"January","February","March",
                "April","may","june",
                "july","August","september",
                "october","November","December"};

        System.out.println(".....for.....");

        for (int i = 0; i <months.length ; i++) {

            System.out.println(months[i]);
        }

        System.out.println("......inverse for.....");

        for (int i =months.length-1; i >=0 ; i--) {

            System.out.println(months[i]);
        }

        System.out.println("......foreach.....");

        for (String month:months) {
            System.out.println(month);
        }

        System.out.println("....while....");

        int counter=0;
        while (counter<months.length){
            System.out.println(months[counter]);
            counter++;
        }

        System.out.println("....do while....");

         counter=0;
        do {
            System.out.println(months[counter]);
            counter++;
        }while (counter<months.length);
    }
}
