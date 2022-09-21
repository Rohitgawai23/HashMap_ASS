
package Collection_Hashmap;

import java.util.HashMap;
//7. Write a Java program to test if a map contains a mapping for the specified key.
public class Q7_ {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("Rohit", 1);
        map.put("Roshan", 2);
        map.put("Shridhar", 3);
        map.put("Tejas", 4);
        map.put("Atul", 5);
        // print the map
        System.out.println("The Original map: " + map);
        System.out.println("1. Is key 'Roshan' exists?");
        if (map.containsKey("Atul")) {
            //key exists
            System.out.println("yes! - " + map.get("Atul"));
        } else {
            //key does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'Atul' exists?");
        if (map.containsKey("Atul")) {
            System.out.println("yes! - " + map.get("Atul"));
        } else {
            System.out.println("no!");
        }

    }
}

/*


Output
        The Original map: {Roshan=2, Rohit=1, Tejas=4, Atul=5, Shridhar=3}
        1. Is key 'Roshan' exists?
        yes! - 5

        2. Is key 'Atul' exists?
        yes! - 5

 */