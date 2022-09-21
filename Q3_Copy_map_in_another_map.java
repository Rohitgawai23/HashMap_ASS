package Collection_Hashmap;

import java.util.HashMap;
//3. Write a Java program to copy all of the mappings from the specified map to another map.
public class Q3_Copy_map_in_another_map {
    public static void main(String[] args) {

        HashMap<Integer,String> map1=new HashMap<>();

        map1.put(1, "Rohit");
        map1.put(2, "Rshan");
        map1.put(3, "Narendra");

        System.out.println("\nValues in 1st map :"+map1);

        HashMap<Integer,String> map2=new HashMap<>();

        map2.put(4, "Prajwal");
        map2.put(5, "Akash");

        System.out.println("\nValues in 2nd map :"+map2);

        map2.putAll(map1);
        System.out.println("\nNow values in 2nd map: "+map2);
    }
}
/*
output ::
        Values in 1st map :{1=Rohit, 2=Rshan, 3=Narendra}

        Values in 2nd map :{4=Prajwal, 5=Akash}

        Now values in 2nd map: {1=Rohit, 2=Rshan, 3=Narendra, 4=Prajwal, 5=Akash}

 */
