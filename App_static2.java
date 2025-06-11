class A {
    static int b = 120;
}

public class App_static2 {
    static int a = 100;

    public static void main(String[] args) {
        System.out.println(a);    // Accessing static variable from the same class
        System.out.println(A.b);  // Accessing static variable from another class
    }
}
