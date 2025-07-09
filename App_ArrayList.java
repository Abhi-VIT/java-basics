import java.util.*;


public class App_ArrayList {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList a = new ArrayList();
        a.add("Hello");
        a.add(10);
        a.add(null);
        System.out.println(a);
        a.remove(2); // removing the third element
        System.out.println(a);
        a.add(2,"m"); // adding "m" at index 2
        a.add("n");
        System.out.println(a);
    }
}
