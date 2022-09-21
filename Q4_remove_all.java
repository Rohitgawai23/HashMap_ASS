package Collection_Hashmap;
import java.util.*;
//4. Write a Java program to remove all of the mappings from a map.
public class Q4_remove_all {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap <Integer,String> ();
        map.put(1, "Rohit");
        map.put(2, "Akash");
        map.put(3, "Narendra");
        map.put(4, "Roshan");
        map.put(5, "prajwal");

        System.out.println("The Original Hash Map: " + map);

        map.clear();
        System.out.println("The New map: " + map);
    }
}
/*
Output :

        The Original Hash Map: {1=Rohit, 2=Akash, 3=Narendra, 4=Roshan, 5=prajwal}
        The New map: {}

 */