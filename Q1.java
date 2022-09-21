package Collection_Hashmap;

import java.util.HashMap;
//1. Write a Java program to associate the specified value with the specified key in a HashMap.
public class Q1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        HashMap<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"Rohit");
        map.put(2,"Roshan");
        map.put(3,"Gaurav");
        map.put(4,"Dhiraj");
        map.put(5,"Swapnil");

        System.out.println(map);

    }
}
/*
output :

        {1=Rohit, 2=Roshan, 3=Gaurav, 4=Dhiraj, 5=Swapnil}


 */
