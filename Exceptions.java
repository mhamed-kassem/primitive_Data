/**
 * Created by user on 28/09/2016.
 */
public class Exceptions {
    public static void main(String[] args){
        String welcome="welcome!";
        char[] chars=welcome.toCharArray();

        try {
            if(chars.length<10){
                throw (new Exception("my custom message"));
            }
            for (int i = 0; i <welcome.length() ; i++) {
                System.out.println(chars[i]);
            }
            String sub=welcome.substring(10);
            System.out.println("subtracting "+sub);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index problem");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("string index problem");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
