// Linked list

import java.util.LinkedList;

public class App_LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("Abhishek");
        l.add(30);
        l.add("Hello");
        System.out.println(l);
        l.add(null);
        System.out.println(l);
        l.set(0, "Abhishek Kumar"); // updating the first element
        System.out.println(l);
        l.removeLast(); // removing the last element
        System.out.println(l);
        l.removeFirst(); // removing the first element
        System.out.println(l);
    }
    
}
