import java.util.Arrays;

/**
 * Created by user on 11/10/2016.
 */
public class array {
    public static void main(String[] args){
        System.out.println("array of primitives");
        int[] ints={9,6,5,8};
        Arrays.sort(ints);
        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
        System.out.println("array of strings");
        String[] strings={"Red","Green","Blue"};
        Arrays.sort(strings);
        for (String color : strings){
            System.out.println(color);
        }
        System.out.println("setting an initial size");
        int[] sized=new int[10];
        for (int i=0;i<sized.length;i++){
            sized[i]=i*100;
        }
        for (int value :sized){
            System.out.println(value);
        }
        System.out.println("copying an array");
        int[] copied=new int[5];
        System.arraycopy(sized,5,copied,0,5);
        for (int value : copied){
            System.out.println(value);
        }

        System.out.println("2D Array");
        String[][] nike_names=new String[3][2];
        nike_names[0][0]="mhamed";
        nike_names[0][1]="MR.copy";
        nike_names[1][0]="ahmed";
        nike_names[1][1]="coman";
        nike_names[2][0]="eid";
        nike_names[2][1]="handy";

        for (int i=0;i<nike_names.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append("the nike name of ")
                    .append(nike_names[i][0])
                    .append(" is ")
                    .append(nike_names[i][1])
                    .append(".");
            System.out.println(sb);
        }

    }
}
