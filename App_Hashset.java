// Hashset

import java.util.*;
public class App_Hashset {
    public static void main(String[] args) {
        HashSet h = new HashSet(); // initial capacity is 16 and load factor is 0.75
        h.add("Abhishek");
        h.add("Nitin");
        h.add("Tushar");
        h.add("Abhishek"); // duplicate element, will not be added
        h.add(null); // null is allowed
        h.add(10); // adding an integer
        h.add(10.5); // adding a double
        h.add(null); // adding null again, will not be added as it is already present
        System.out.println(h); // prints the set, order is not guaranteed
        System.out.println(h.add("Abhishek")); // trying to add a duplicate element, will return false
        System.out.println(h); // prints the set again, no change in the set

    }
    
}
