package Collection_Hashmap;

import java.util.HashMap;
//12. Write a Java program to get a collection view of the values contained in this map.
public class Q12_Collectio_views {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"Rohit");
        map.put(2,"Roshan");
        map.put(3,"Gaurav");
        map.put(4,"Dhiraj");
        map.put(5,"Swapnil");

        System.out.println(map);

        System.out.println("Collection view is :"+map.values());
    }
}
/*
Output :

        {1=Rohit, 2=Roshan, 3=Gaurav, 4=Dhiraj, 5=Swapnil}
        Collection vir=ew is :[Rohit, Roshan, Gaurav, Dhiraj, Swapnil]

 */