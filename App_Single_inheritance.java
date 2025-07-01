class A {
    public void display() {
        System.out.println("Display method of class A");
    }
}
class B extends A {
    public void test() {
        System.out.println("Display method of class B");
    }
}
// Single inheritance example in Java
// Class B inherits from class A
public class App_Single_inheritance {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        B objB = new B();
        objB.display(); // Calls A's display method
        objB.test(); // Calls B's test method
    }
}