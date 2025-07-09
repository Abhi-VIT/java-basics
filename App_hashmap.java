// Hash map

import java.util.*;

public class App_hashmap {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("A", 1);
        m.put("B", 2); 
        m.put("C", 3);
        m.put("D", 4);
        m.put("E", 5);
        System.out.println(m);
        Set s = m.keySet(); // get the keys
        System.out.println(s);
        Collection c = m.values(); // get the values
        System.out.println(c);
        Set s1 = m.entrySet(); // get the key-value pairs
        System.out.println(s1);
        // iterate through the hashmap
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
    
}
// Differences between HashMap and LinkedHashMap:
// 1. HashMap does not maintain the order of elements, while LinkedHashMap maintains the insertion order.
// 2. HashMap is generally faster than LinkedHashMap, as it does not have to maintain the order.
// 3. LinkedHashMap uses a doubly linked list to maintain the order of elements, while HashMap uses a hash table.
// 4. LinkedHashMap can be used to create a cache, where the least recently accessed elements can be removed when the cache size exceeds a certain limit.
// 5. HashMap allows null values and one null key, while LinkedHashMap allows null values and one null key as well, but it maintains the order of insertion for the keys.