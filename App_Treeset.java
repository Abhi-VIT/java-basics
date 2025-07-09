// Treeset
import java.util.*;
public class App_Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Abhishek");
        ts.add("Nitin");
        ts.add("Tushar");
        // ts.add(null); // NullPointerException, as TreeSet does not allow null elements
        // ts.add(10); // ClassCastException, as TreeSet requires elements to be comparable
        // ts.add(10.5); // ClassCastException, as TreeSet requires elements to be comparable
        ts.add("Abhishek"); // duplicate element, will not be added
        ts.add("Zara"); // adding another string
        //ts.add(10); // adding an integer, will be autoboxed to Integer
        //ts.add(20); // adding another integer
        // ts.add(null); // null is not allowed in TreeSet, will throw NullPointerException
        // ts.add(10.5); // ClassCastException, as TreeSet requires elements to be comparable

        System.out.println(ts); // prints the set in sorted order
    }
}
// Note: TreeSet does not allow null elements, and it requires elements to be comparable.
// If you try to add null or non-comparable elements, it will throw exceptions.
// in empty treeset first element is null allowed after that we can add elements
// if we add null after adding elements it will throw NullPointerException