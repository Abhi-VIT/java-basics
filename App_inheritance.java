// Inheritance??
// Parent
// Child

// IS-A
// Types:
// 1. Single Inheritance - 1 base class and 1 derived class
// 2. Multilevel Inheritance - 1 base class and multiple derived classes in a chain
// 3. Hierarchical Inheritance - multiple derived classes from a single base class
// 4. Multiple Inheritance (not supported in Java) // hybrid inheritance


// base class // super class // parent class
class A {
    void display() {
        System.out.println("Display method in class A");
    }
}
// derived class // sub class // child class
// A is a superclass of B
class B extends A { // B is a subclass of A
    // B inherits from A
    // B can override methods from A
    // 1. single inheritance
    void display() {
        System.out.println("Display method in class B");
    }
}

public class App_inheritance {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        A objA = new A();
        objA.display(); // Calls A's display method
        B objB = new B();
        objB.display(); // Calls B's display method
    }
}
