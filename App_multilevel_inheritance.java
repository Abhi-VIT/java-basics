// Multilevel and hierarchical 
// grand parent ----> parent -----> child

class A {
    // grandparent class
    void display() {
        System.out.println("Grandparent");
    }
}

class B extends A {
    // parent class
    void test() {
        System.out.println("Parent");
    }
}

class C extends B {
    // child class
    void foo() {
        System.out.println("Child");
    }
}

class D extends C {
    void hai() {
        System.out.println("Child of Child");
    }
}

public class App_multilevel_inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // Calls the display method in child class, which calls parent and grandparent methods
        obj.test();    // Calls the test method in parent class
        obj.foo();     // Calls the foo method in child class
        obj.hai();     // Calls the hai method in child of child class
        // Output will be:
        // Grandparent
        // Parent
        // Child
    }
}