package Collection_Hashmap;

import java.util.HashMap;
// 2. Write a Java program to count the number of key-value (size) mappings in a map.
public class Q2_count_the_number_of_key_value {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"India");
        map.put(2,"China");
        map.put(3,"Us");
        map.put(4,"England");
        map.put(5,"Pakistan");

        System.out.println(map);
        System.out.println("Size of the hash map: "+map.size());


    }
}
/*
Output :

        {1=India, 2=China, 3=Us, 4=England, 5=Pakistan}
        Size of the hash map: 5

 */
