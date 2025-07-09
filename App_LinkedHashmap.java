// LinkedHashMap

import java.util.*;
public class App_LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("C", 3);
        lhm.put("D", 4);
        lhm.put("E", 5);
        lhm.put("F", 6);
        lhm.put("G", 7);
        lhm.put("H", 8);
        lhm.put("I", 9);
        lhm.put("J", 10);
        System.out.println(lhm);
        Set s = lhm.keySet();
        System.out.println(s);
        Collection c = lhm.values();
        System.out.println(c);
        Set s1 = lhm.entrySet();
        System.out.println(s1);
        // iterate through the linkedhashmap
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }   
}
// linkedhashmap follows insertion order
// it is a combination of hashmap and linkedlist
// key should be homogeneous otherwise it will throw ClassCastException
// value can be heterogeneous