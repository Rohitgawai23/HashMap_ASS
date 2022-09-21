package Collection_Hashmap;
import java.util.*;
//10. Write a Java program to get the value of a specified key in a map.
public class Q10 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"Rohit");
        map.put(2,"Roshan");
        map.put(3,"Gaurav");
        map.put(4,"Atul");
        map.put(5,"Swapnil");

        String val=(String)map.get(2);

        System.out.println("Value for key 2 is: " + val);
    }
}
