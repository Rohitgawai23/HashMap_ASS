package Collection_Hashmap;

import java.util.HashMap;
// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
public class Q5_empty_or_not {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap <Integer,String> ();
        map.put(1, "Rohit");
        map.put(2, "Akash");
        map.put(3, "Narendra");
        map.put(4, "Roshan");
        map.put(5, "prajwal");

        System.out.println("The Original Hash map: " + map);

        boolean result = map.isEmpty();

        System.out.println("is hash map empty: "+result);

        map.clear();

        result=map.isEmpty();

        System.out.println("is has map empty: "+result);

    }
}

/*
Output :

        The Original Hash map: {1=Rohit, 2=Akash, 3=Narendra, 4=Roshan, 5=prajwal}
        is hash map empty: false
        is has map empty: true


 */